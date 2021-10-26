
package Domain.Payments;


public class CashPayment implements Payment {

    @Override
    public String proceed() {
        String msg = "Cash";
        return msg;
    }
    
}
