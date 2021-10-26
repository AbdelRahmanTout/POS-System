package TechnicalServices.Persistence;

import Domain.Sales.Product;
import Domain.Sales.Sale;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//class pour inserer les products et les Sales sur la Database 
public class PersistentStorage {
    
    private String insprod = "insert into product values(?,?,?)";
    private String inssale = "insert into sales(date,time,amount) values(?,?,?)";
    
    private PreparedStatement prodStmt;
    private PreparedStatement saleStmt;
    
    public PersistentStorage() {
        try {
            prodStmt = Datasource.getConnection().prepareStatement(insprod);
            saleStmt = Datasource.getConnection().prepareStatement(inssale);
        } catch (SQLException ex) {
            Logger.getLogger(PersistentStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //insert new Product into ProductDB
    public void create_product(Product prod) throws SQLException {
        prodStmt.setInt(1, prod.getId());
        prodStmt.setFloat(2, prod.getPrice());
        prodStmt.setString(3, prod.getDescription());
        prodStmt.executeUpdate();
    }
    
    //insert new Sale into SaleDB
    public void create_sale(Sale sale) throws SQLException {
        saleStmt.setString(1, sale.getDate());
        saleStmt.setString(2, sale.getTime());
        saleStmt.setFloat(3, sale.getPayment().getAmount());   
        saleStmt.executeUpdate();
    }
        
}
