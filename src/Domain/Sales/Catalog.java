package Domain.Sales;

import TechnicalServices.Persistence.TransferFromDB;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Catalog {

    public Map<Integer, Product> descriptions = new HashMap< Integer, Product>();

    public Catalog() {
        loadSpecs();
    }
    
    public Product getProduct(int id) {
        return descriptions.get(id);
    }

    //read all products from the database and fill descriptions.
    public void loadSpecs() {
        descriptions.clear();
        try {
            List<Product> list = new TransferFromDB().findall_product();
            for (int i = 0; i < list.size(); i++) {
                descriptions.put(list.get(i).getId(), list.get(i));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Catalog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
