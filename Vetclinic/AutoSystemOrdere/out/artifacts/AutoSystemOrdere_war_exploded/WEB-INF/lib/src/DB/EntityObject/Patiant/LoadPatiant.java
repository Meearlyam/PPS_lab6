package DB.EntityObject.Patiant;

import Clients.Patiant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoadPatiant {
    public Patiant loadLegalClient(Connection connection, String nickname) {

        Patiant patiant = new Patiant();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, type, nickname, " +
                    "birthday, sex, ownerName, medHistNum FROM Patiants WHERE nickname = ?");
            preparedStatement.setString(1, nickname);

            ResultSet resultSet = preparedStatement.executeQuery();

            patiant.setType(resultSet.getString(2));
            patiant.setId(resultSet.getInt(1));
            patiant.setNickname(resultSet.getString(3));
            patiant.setBirthday(resultSet.getDate(4));
            patiant.setSex(resultSet.getString(5));
            patiant.setOwnerName(resultSet.getString(6));
            patiant.setMedHistNum(resultSet.getInt(7));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return patiant;
    }
}
