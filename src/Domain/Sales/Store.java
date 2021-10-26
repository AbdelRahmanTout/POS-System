package Domain.Sales;

public class Store {

    private String name;
    private String address;
    private Catalog catalog = new Catalog();
    private Register register = new Register(catalog);

    public Register getRegister() {
        return register;
    }

    public Store(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public static final Store instance = new Store("Lebanon");//class singleton

}
