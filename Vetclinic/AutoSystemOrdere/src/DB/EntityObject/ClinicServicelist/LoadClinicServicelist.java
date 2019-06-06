package DB.EntityObject.ClinicServicelist;

import Entity.MedService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LoadClinicServicelist {

    public ArrayList<MedService> loadCompanyServicelist(){
        ArrayList<MedService> p = new ArrayList<MedService>();
        try{
            String pathToDB = "jdbc:sqlite:C:\\Users\\Asus\\IdeaProjects\\Vetclinic\\AutoSystemOrdere\\VetDB.db";
            DB.SetConnection s = new DB.SetConnection();
            Connection connection = s.setConnectDB(pathToDB);

            PreparedStatement preparedStatement = connection.prepareStatement("SELECT price, name" +
                    "description FROM MedService");

            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String name = rs.getString(2);
                double price = rs.getDouble(3);
                String desc = rs.getString(4);

                p.add(new MedService(price, desc, name));
            }

            s.closeConnection(connection);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return p;
    }
}

