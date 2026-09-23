package Services;

import org.springframework.stereotype.Component;

@Component
public class UPIPayment implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Payment done via UPI");
    }
}
