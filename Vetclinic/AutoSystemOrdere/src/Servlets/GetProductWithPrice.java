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

@WebServlet( urlPatterns = {"/Servlets.GetProductWithPrice"})
public class GetProductWithPrice extends HttpServlet {
    public GetProductWithPrice(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoadClinicServicelist ld = new LoadClinicServicelist();

        ArrayList<MedService> medServices = ld.loadCompanyServicelist();
        ArrayList<MedService> suitableMedService = new ArrayList<MedService>();

        double from = Double.parseDouble(req.getParameter("from"));
        double to = Double.parseDouble(req.getParameter("to"));

        for(MedService p : medServices){
            if(p.getPrice() >= from && p.getPrice() <= to){
                suitableMedService.add(p);
            }
        }

        req.setAttribute("productList", suitableMedService);
        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/MedService/MedServiceList.jsp");
        dispatcher.forward(req, resp);
    }
}
