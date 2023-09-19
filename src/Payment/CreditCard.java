package Payment;

import Model.User;
import service.Service;

public class CreditCard implements Payment {

    private String cardNumber;
    private String expiryDate;
    private String cvv;
    public CreditCard() {}
    public CreditCard(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }



    public void pay(User user, Service service){

    }
}
