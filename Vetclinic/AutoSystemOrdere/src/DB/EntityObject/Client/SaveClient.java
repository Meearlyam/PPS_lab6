package DB.EntityObject.Client;

import Clients.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Calendar;

public class SaveClient {
    public void saveClient(Client client, Connection connection){
        String sql = "INSERT INTO Clients(id, FIO, address, phoneNumber, e-mail, " +
                "personalDiscount) VALUES(?,?,?,?,?,?)";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, client.getId());
            preparedStatement.setString(3, client.getAddress());
            preparedStatement.setString(2, client.getFIO());
            preparedStatement.setString(4, client.getPhoneNumber());
            preparedStatement.setString(5, client.getEmail());
            preparedStatement.setInt(6, client.getPersonalDiscount());

            preparedStatement.executeUpdate();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
