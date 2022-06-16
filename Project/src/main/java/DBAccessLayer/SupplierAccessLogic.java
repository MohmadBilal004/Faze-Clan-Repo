
package DBAccessLayer;

import DBLayer.DatabaseConnection;
import Models.Supplier;
import java.sql.SQLException;
public class SupplierAccessLogic {
    private DatabaseConnection SingleCon; // To have single 
    
    public SupplierAccessLogic() {
        SingleCon = DatabaseConnection.getSingleInstance();
    }
    
    public boolean addSupplierToDB(Supplier supplier) {
        try {
            String query = "insert into bicycle values(" + supplier.getSname()+ "," + supplier.getSno()+ supplier.getContactNo()+ supplier.getLocation()+supplier.getEmail()+");";
            boolean result = SingleCon.EecuteQuery(query);
            return result;
        } catch (Exception ex) {
            return false;
        }
    }
}
