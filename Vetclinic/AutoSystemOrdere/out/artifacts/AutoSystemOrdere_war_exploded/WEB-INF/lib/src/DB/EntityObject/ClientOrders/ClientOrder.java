package DB.EntityObject.ClientOrders;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClientOrder {
    public void saveClientOrder(int clientId, int productId){
        String sql = "INSERT INTO ClientOrders(Client_id, Product_id) VALUES(?,?)";
        String pathToDB = "jdbc:sqlite:C:\\Users\\Asus\\IdeaProjects\\Vetclinic\\AutoSystemOrdere\\VetDB.db";
        DB.SetConnection s = new DB.SetConnection();
        Connection connection = s.setConnectDB(pathToDB);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, clientId);
            preparedStatement.setInt(2, productId);

            preparedStatement.executeUpdate();
        }
        catch (Exception e){e.printStackTrace();}

        s.closeConnection(connection);
    }
}
