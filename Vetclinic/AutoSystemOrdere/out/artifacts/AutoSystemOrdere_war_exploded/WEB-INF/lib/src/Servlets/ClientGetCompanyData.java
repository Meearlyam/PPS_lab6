package Servlets;

import Clinic_package.Doctor;
import DB.EntityObject.DoctorsSUBDB.LoadDoctor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = { "/Servlets.ClientGetCompanyData"})
public class ClientGetCompanyData extends HttpServlet {
    public ClientGetCompanyData(){
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoadDoctor ld = new LoadDoctor();

        ArrayList<Doctor> companies = ld.loadDoctor();

        req.setAttribute("companyList", companies);
        RequestDispatcher dispatcher = req.getServletContext()
                .getRequestDispatcher("/Doctor/DoctorsList.jsp");
        dispatcher.forward(req, resp);
    }
}
