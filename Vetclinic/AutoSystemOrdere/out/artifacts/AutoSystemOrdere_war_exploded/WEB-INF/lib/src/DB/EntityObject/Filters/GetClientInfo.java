package DB.EntityObject.Filters;

import Clients.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GetClientInfo {
    public int getOrderId(int productId){
        int orderId = 0;

        try {
            String pathToDB = "jdbc:sqlite:C:\\Users\\Asus\\IdeaProjects\\Vetclinic\\AutoSystemOrdere\\VetDB.db";
            DB.SetConnection s = new DB.SetConnection();
            Connection connection = s.setConnectDB(pathToDB);

            String str = "SELECT id FROM MedicalHistories WHERE patiantID=2";
            //str += productId;

                    PreparedStatement preparedStatement =
                    connection.prepareStatement(str);

            ResultSet rs = preparedStatement.executeQuery();
            orderId = rs.getInt(1);

            s.closeConnection(connection);
        }
        catch (Exception e){ e.printStackTrace(); }
        return orderId;
    }

    public int getClientId(int mdID){
        int clientId = 0;

        try {
            String pathToDB = "jdbc:sqlite:C:\\Users\\Asus\\IdeaProjects\\Vetclinic\\AutoSystemOrdere\\VetDB.db";
            DB.SetConnection s = new DB.SetConnection();
            Connection connection = s.setConnectDB(pathToDB);

            String str = "SELECT clientID FROM MedicalHistories WHERE medserviceID = ?";
            //str += productId;

            PreparedStatement preparedStatement =
                    connection.prepareStatement(str);
            preparedStatement.setInt(1, mdID);
            ResultSet rs = preparedStatement.executeQuery();
            clientId = rs.getInt(1);

            s.closeConnection(connection);
        }
        catch (Exception e){ e.printStackTrace(); }
        return clientId;
    }

    public ArrayList<Client> getClientList(ArrayList<Integer> integers){
        ArrayList<Client> clients = new ArrayList<Client>();

        String pathToDB = "jdbc:sqlite:D:\\PPS\\ClinicDB.sqlite";
        DB.SetConnection s = new DB.SetConnection();
        Connection connection = s.setConnectDB(pathToDB);

        try{
            for(Integer p : integers){
                int clientId = getClientId(p);

                if(clientId != 0) {
                    Client client = new Client();

                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT address, FIO, " +
                            "phoneNumber, e-mail, personalDiscount FROM Clients WHERE id = ?");
                    preparedStatement.setInt(1, clientId);

                    ResultSet resultSet = preparedStatement.executeQuery();

                    client.setAddress(resultSet.getString(3));
                    client.setFIO(resultSet.getString(2));
                    client.setPersonalDiscount(resultSet.getInt(6));
                    client.setPhoneNumber(resultSet.getString(4));
                    client.setEmail(resultSet.getString(5));

                    clients.add(client);
                }
            }

            s.closeConnection(connection);
        }
        catch (Exception e) {e.printStackTrace();}

        return clients;
    }

}
