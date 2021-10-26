package Domain.Sales;

import java.sql.Time;
import java.time.LocalDate;
import Domain.Taxes.LebanonTax;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Sale {

    private final String date;
    private final String time;
    private List<Product> list = new ArrayList(); //list of chosen Products
    private Payment payment = new Payment();//Payment amount

    public Sale(List<Product> ls) {
        this.date = LocalDate.now().toString();
        this.time = Time.valueOf(LocalTime.now()).toString();
        this.list = ls;
        this.payment.setAmount(calculer_amount());
    }

    //constructor for read all Sales from SaleDB
    public Sale(String date, String time, float amount) {
        this.date = date;
        this.time = time;
        this.payment.setAmount(amount);
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public Payment getPayment() {
        return payment;
    }

    //calculer l'amount du list des products choisis(net)  
    public int calculer_amount_net() {
        int am = 0;
        for (int i = 0; i < list.size(); i++) {
            am += list.get(i).getPrice();
        }
        return am;
    }

    //calculer l'amount final avec Taxes (net+Taxe) 
    public float calculer_amount() {
        int net = calculer_amount_net();
        float taxpercentage = new LebanonTax().TaxPercentage();
        float taxe = (1 + taxpercentage) * net;
        return taxe + net;
    }

    @Override
    public String toString() {
        return "Sale{date:" + date + ", time:" + time + ", amount(net):" + payment.getAmount() + "$" + "}";
    }

}
