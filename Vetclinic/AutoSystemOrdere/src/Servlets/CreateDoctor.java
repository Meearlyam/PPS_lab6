package Servlets;

import Clinic_package.Doctor;
import DB.EntityObject.DoctorsSUBDB.SaveDoctor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(urlPatterns = { "/Servlets.CreateDoctor"})
public class CreateDoctor extends HttpServlet {
    public CreateDoctor() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String doctorFIO = req.getParameter("doctorFIO");
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        String specialization = req.getParameter("specialization");
        String address = req.getParameter("address");
        int experience = 0;
        try {
            experience = Integer.parseInt(req.getParameter("experience"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        String pathToDB = "";
        DB.SetConnection s = new DB.SetConnection();
        Connection connection = s.setConnectDB(pathToDB);

        Doctor doctor = new Doctor(doctorFIO, phoneNumber, experience, email,
                address, specialization);

        SaveDoctor saveDoctor = new
                SaveDoctor();
        saveDoctor.saveDoctor(doctor, connection);

        s.closeConnection(connection);

        resp.sendRedirect(req.getContextPath() + "/Doctor/doctorMenu.jsp");
    }
}
