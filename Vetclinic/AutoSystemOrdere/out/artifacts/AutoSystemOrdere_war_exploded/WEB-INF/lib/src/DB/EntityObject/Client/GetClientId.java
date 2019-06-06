package DB.EntityObject.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetClientId {

    public int getClientId(String fullName) {

        String pathToDB = "jdbc:sqlite:C:\\Users\\Asus\\IdeaProjects\\Vetclinic\\AutoSystemOrdere\\VetDB.db";
        DB.SetConnection s = new DB.SetConnection();
        Connection connection = s.setConnectDB(pathToDB);

        int id = -1;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id FROM Clients WHERE FIO = ?");
            preparedStatement.setString(1, fullName);

            ResultSet resultSet = preparedStatement.executeQuery();
            id = resultSet.getInt(1);

        } catch (Exception e) {
            e.printStackTrace();
        }

        s.closeConnection(connection);
        return id;
    }

}
