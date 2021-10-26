package TechnicalServices.Persistence;

import Domain.Sales.Product;
import Domain.Sales.Sale;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

//class for read products and Sales from Database
public class TransferFromDB {

    private String findprod = "select * from product";
    private String findprodbyid = "select * from product where id = ?";
    private String findsale = "select * from sales";

    private PreparedStatement prodStmt;
    private PreparedStatement prodStmt2;
    private PreparedStatement saleStmt;

    public TransferFromDB() {
        try {
            prodStmt = Datasource.getConnection().prepareStatement(findprod);
            prodStmt2 = Datasource.getConnection().prepareStatement(findprodbyid);
            saleStmt = Datasource.getConnection().prepareStatement(findsale);
        } catch (SQLException ex) {
            Logger.getLogger(PersistentStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //read all product from ProductDB
    public List<Product> findall_product() throws SQLException {
        List<Product> ls = new ArrayList();
        try {

            ResultSet set = prodStmt.executeQuery();

            while (set.next()) {

                ls.add(new Product(set.getInt(1), set.getInt(2), set.getString(3)));
            }
            set.close();
        } catch (SQLException ex) {
            Logger.getLogger(TransferFromDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }
    
    //read the product from productDB by id
    public Product findbyid_product(int id) throws SQLException {
        prodStmt2.setInt(1, id);
        try {

            ResultSet set = prodStmt2.executeQuery();

            if (set.next()) {

                return new Product(set.getInt(1), set.getInt(2), set.getString(3));
            }
            set.close();
        } catch (SQLException ex) {
            Logger.getLogger(TransferFromDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //read all sale from SaleDB
    public List<Sale> findall_sale() throws SQLException {
        List<Sale> ls = new ArrayList();
        try {

            ResultSet set = saleStmt.executeQuery();

            while (set.next()) {

                ls.add(new Sale(set.getString(2), set.getString(3), set.getFloat(4)));
            }
            set.close();
        } catch (SQLException ex) {
            Logger.getLogger(TransferFromDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }

    
}
