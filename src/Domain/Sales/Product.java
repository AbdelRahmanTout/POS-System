package Domain.Sales;

public class Product {

    private int id;
    private float price;
    private String description;

    public Product(int id, int price, String description) {
        this.id = id;
        this.price = price;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description + "{" + "price=" + price + "$" + "}";
    }

}
