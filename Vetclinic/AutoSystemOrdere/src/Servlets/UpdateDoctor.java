package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

@WebServlet(urlPatterns = {"/Servlets.UpdateDoctor" } )
public class UpdateDoctor extends HttpServlet{
    public UpdateDoctor() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String doctorFIO = req.getParameter("doctorFIO");
        int experience = 1;
        try {
            experience = Integer.parseInt(req.getParameter("experience"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        String specialization = req.getParameter("specialization");
        String address = req.getParameter("address");

        String pathToDB = "";
        DB.SetConnection s = new DB.SetConnection();
        Connection connection = s.setConnectDB(pathToDB);

        try {
            String sql = "UPDATE Doctors SET  experience = ?, phoneNumber = ?," +
                    "email = ?, specialization = ?, address = ? WHERE id = 3";
            //sql.concat(companyName + "')");

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, experience);
            preparedStatement.setString(2, phoneNumber);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, specialization);
            preparedStatement.setString(5, address);
            //preparedStatement.setString(6, companyName);
            //preparedStatement.setInt(6, 3);

            preparedStatement.executeUpdate();
        }
        catch (Exception e) {e.printStackTrace();}

        s.closeConnection(connection);

        resp.sendRedirect(req.getContextPath() + "/Doctor/doctorMenu.jsp");
    }

}
