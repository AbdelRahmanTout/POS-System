
package Domain.Payments;


public class CreditPayment implements Payment {

    @Override
    public String proceed() {
        String msg = "Credit card";
        return msg;
    }
    
}
