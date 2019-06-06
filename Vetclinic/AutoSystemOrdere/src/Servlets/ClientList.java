package Servlets;

import Clients.Client;
import DB.EntityObject.Client.LoadClients;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet( urlPatterns = {"/Servlets.ClientList"})
public class ClientList extends HttpServlet {
    public ClientList(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoadClients lc =
                new LoadClients();

        ArrayList<Client> clients = lc.loadClients();

        req.setAttribute("ind", clients);
        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/Filter/ClientList.jsp");
        dispatcher.forward(req, resp);
    }
}
