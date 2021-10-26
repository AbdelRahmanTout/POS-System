
package Domain.Payments;


public class CheckPayment implements Payment {

    @Override
    public String proceed() {
        String msg = "Check";
        return msg;
    }
    
}
