
package Domain.Sales;


public class Payment {
  private float amount;

    public Payment(float amount) {
        this.amount = amount;
    }
    
    public Payment() {
        
    }
    
    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }
  
}
