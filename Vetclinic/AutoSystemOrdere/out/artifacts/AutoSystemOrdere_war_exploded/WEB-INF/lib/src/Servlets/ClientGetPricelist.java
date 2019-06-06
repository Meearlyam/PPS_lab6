package Servlets;

import DB.EntityObject.ClinicServicelist.LoadClinicServicelist;
import Entity.MedService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = { "/Servlets.ClientGetPricelist"})
public class ClientGetPricelist extends HttpServlet {
    public ClientGetPricelist() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoadClinicServicelist ld = new LoadClinicServicelist();

        ArrayList<MedService> medServices = ld.loadCompanyPricelist();

        req.setAttribute("productList", medServices);
        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/MedService/MedServiceList.jsp");
        dispatcher.forward(req, resp);
    }
}