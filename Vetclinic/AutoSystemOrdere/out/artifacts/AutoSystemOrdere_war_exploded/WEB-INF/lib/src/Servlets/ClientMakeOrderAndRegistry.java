package Servlets;

import Clients.Client;
import DB.EntityObject.Client.GetClientId;
import DB.EntityObject.Client.SaveClient;
import DB.EntityObject.Filters.GetProductId;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

@WebServlet( urlPatterns = {"/Servlets.ClientMakeOrderAndRegistry"})
public class ClientMakeOrderAndRegistry extends HttpServlet {
    public ClientMakeOrderAndRegistry() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productName = req.getParameter("product");
        String fullname = req.getParameter("fullname");
        String address = req.getParameter("address");
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");

        GetProductId getProductId = new GetProductId();
        ArrayList<Integer> products = getProductId.getProductId(productName);

        if(products.isEmpty()) {
            resp.sendRedirect(req.getContextPath() + "/ClientAction/ClientErrorNoSuchProduct.jsp");
        }

        String pathToDB = "jdbc:sqlite:/Users/alex/Downloads/Duda/PRPC/prpc.db";
        DB.SetConnection s = new DB.SetConnection();
        Connection connection = s.setConnectDB(pathToDB);

        Client client = new Client(address, fullname, phoneNumber, email, 0);

        SaveClient saveClient = new SaveClient();
        saveClient.saveClient(client, connection);

        s.closeConnection(connection);

        GetClientId ld = new GetClientId();
        int clientId = ld.getClientId(fullname);

        if(clientId == -1) {
            resp.sendRedirect(req.getContextPath() + "/ClientAction/ClientErrorNoSuchAccount.jsp");
        }

        DB.EntityObject.ClientOrders.ClientOrder clientOrder = new DB.EntityObject.ClientOrders.ClientOrder();
        clientOrder.saveClientOrder(clientId, products.get(0));

        resp.sendRedirect(req.getContextPath() + "/ClientAction/SuccessOrder.jsp");
    }
}
