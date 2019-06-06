package DB.EntityObject.Client;

import Clients.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoadClient {
    public Client loadClient(Connection connection, String FIO){

        Client client = new Client();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT FIO, address, " +
                    "phoneNumber, e-mail, personalDiscount FROM Clients WHERE FIO = ?");
            preparedStatement.setString(1, FIO);

            ResultSet resultSet = preparedStatement.executeQuery();

            client.setAddress(resultSet.getString(3));
            client.setFIO(resultSet.getString(2));
            client.setPhoneNumber(resultSet.getString(4));
            client.setEmail(resultSet.getString(5));
            client.setPersonalDiscount(resultSet.getInt(6));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return client;
    }
}
