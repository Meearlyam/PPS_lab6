package DB.EntityObject.DoctorsSUBDB;

import Clinic_package.Doctor;
import Entity.MedService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class SaveDoctor {
    public void saveDoctor(Doctor doctor, Connection connection){
        String sql = "INSERT INTO Doctors(FIO,email,experience,specialization,phoneNumber,address) VALUES(?,?,?,?,?,?)";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, doctor.getFIO());
            preparedStatement.setString(2, doctor.getEmail());
            preparedStatement.setInt(3, doctor.getExperience());
            preparedStatement.setString(4, doctor.getSpecialization());
            preparedStatement.setString(5, doctor.getPhoneNumber());
            preparedStatement.setString(6, doctor.getAddress());
            preparedStatement.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
