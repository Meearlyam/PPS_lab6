package DB.EntityObject.Client;

import Clients.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LoadClients {
    public ArrayList<Client> loadClients(){

        String pathToDB = "jdbc:sqlite:C:\\Users\\Asus\\IdeaProjects\\Vetclinic\\AutoSystemOrdere\\VetDB.db";
        DB.SetConnection s = new DB.SetConnection();
        Connection connection = s.setConnectDB(pathToDB);
        ArrayList<Client> clients = new ArrayList<Client>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, FIO, address, " +
                    "phoneNumber, e-mail, personalDiscount FROM Clients");

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                Client client = new Client();

                client.setId(resultSet.getInt(1));
                client.setAddress(resultSet.getString(3));
                client.setFIO(resultSet.getString(2));
                client.setPhoneNumber(resultSet.getString(4));
                client.setEmail(resultSet.getString(5));
                client.setPersonalDiscount(resultSet.getInt(6));

                clients.add(client);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        s.closeConnection(connection);
        return clients;
    }
}