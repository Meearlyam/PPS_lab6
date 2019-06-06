package DB.EntityObject.DoctorsSUBDB;

import Clinic_package.Doctor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LoadDoctor {
    public ArrayList<Doctor> loadDoctor(){
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        try{
            String pathToDB = "jdbc:sqlite:C:\\Users\\Asus\\IdeaProjects\\Vetclinic\\AutoSystemOrdere\\VetDB.db";
            DB.SetConnection s = new DB.SetConnection();
            Connection connection = s.setConnectDB(pathToDB);

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT FIO, email " +
                    "phoneNumber, address, experience, specialization FROM Doctors");

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String FIO = rs.getString(2);
                int experience = rs.getInt(4);
                String email = rs.getString(3);
                String specialization = rs.getString(5);
                String phoneNumber = rs.getString(6);
                String address = rs.getString(7);

                doctors.add(new Doctor(FIO, phoneNumber, experience, email,
                        address, specialization));
            }

            s.closeConnection(connection);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return doctors;
    }
}
