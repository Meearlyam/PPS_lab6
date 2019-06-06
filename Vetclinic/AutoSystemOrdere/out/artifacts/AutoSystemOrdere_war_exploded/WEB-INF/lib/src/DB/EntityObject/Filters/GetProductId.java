package DB.EntityObject.Filters;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class GetProductId {
    public ArrayList<Integer> getProductId(String productName){
        ArrayList<Integer> productIds = new ArrayList<Integer>();
        try {

            String pathToDB = "jdbc:sqlite:C:\\Users\\Asus\\IdeaProjects\\Vetclinic\\AutoSystemOrdere\\VetDB.db";
            DB.SetConnection s = new DB.SetConnection();
            Connection connection = s.setConnectDB(pathToDB);

            PreparedStatement preparedStatement =
                    connection.prepareStatement("SELECT id FROM Product WHERE productDescription LIKE ?");
            preparedStatement.setString(1, "%" + productName + "%");
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                productIds.add(rs.getInt(1));
            }
            s.closeConnection(connection);

            return productIds;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return productIds;
    }
}
