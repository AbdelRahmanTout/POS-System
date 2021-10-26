package Domain.Sales;

import TechnicalServices.Persistence.PersistentStorage;
import java.util.List;

//class Controller
public class Register {

    private Catalog catalog;
    private Sale sale;
    private PersistentStorage storage = new PersistentStorage();

    public Register(Catalog catalog) {
        this.catalog = catalog;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public PersistentStorage getStorage() {
        return storage;
    }

    public Sale getSale() {
        return sale;
    }
    
    public void makeNewSale(List<Product> ls) {
        sale = new Sale(ls);
    }

}
