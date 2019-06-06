package DB.EntityObject.Patiant;

import Clients.Patiant;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SavePatiant {
    public void savePatiant(Patiant patiant, Connection connection){
        String sql = "INSERT INTO Patiants(id, type, nickname, birthday, sex, " +
                "ownerName, medHistNum) VALUES(?,?,?,?,?,?,?)";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, patiant.getId());
            preparedStatement.setString(2, patiant.getType());
            preparedStatement.setString(3, patiant.getNickname());
            preparedStatement.setDate(4, patiant.getBirthday());
            preparedStatement.setString(5, patiant.getSex());
            preparedStatement.setString(6, patiant.getOwnerName());
            preparedStatement.setString(7, patiant.getType());

            preparedStatement.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

