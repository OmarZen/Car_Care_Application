package Payment;

import Model.User;
import service.Service;

public interface Payment {
    public void pay(User user, Service service);
}
