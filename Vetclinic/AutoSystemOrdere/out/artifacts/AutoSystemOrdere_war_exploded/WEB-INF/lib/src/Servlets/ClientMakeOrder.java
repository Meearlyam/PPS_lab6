package Servlets;

import DB.EntityObject.Client.GetClientId;
import DB.EntityObject.Filters.GetProductId;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet( urlPatterns = {"/Servlets.ClientMakeOrder"})
public class ClientMakeOrder extends HttpServlet {
    public ClientMakeOrder(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productName = req.getParameter("product");
        String fullname = req.getParameter("fullname");

        GetProductId getProductId = new GetProductId();
        ArrayList<Integer> products = getProductId.getProductId(productName);

        if(products.isEmpty()) {
            resp.sendRedirect(req.getContextPath() + "/ClientAction/ClientErrorNoSuchProduct.jsp");
        }

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
