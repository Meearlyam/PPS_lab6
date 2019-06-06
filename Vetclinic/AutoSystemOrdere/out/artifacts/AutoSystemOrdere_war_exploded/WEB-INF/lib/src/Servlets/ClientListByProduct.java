package Servlets;

import Clients.Client;
import DB.EntityObject.Filters.GetClientInfo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet( urlPatterns = {"/Servlets.ClientListByProduct"})
public class ClientListByProduct extends HttpServlet {
    public ClientListByProduct() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DB.EntityObject.Filters.GetProductId productId =
                new DB.EntityObject.Filters.GetProductId();

        String productName = req.getParameter("productName");
        ArrayList<Integer> ids = productId.getProductId(productName);

        GetClientInfo getPatientInfo =
                new GetClientInfo();

        ArrayList<Client> clients = getPatientInfo.getClientList(ids);


        req.setAttribute("ind", clients);
        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/Filter/ClientByProducts.jsp");
        dispatcher.forward(req, resp);
    }

}
