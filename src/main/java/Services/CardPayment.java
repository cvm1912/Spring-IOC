package Services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CardPayment implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Payment done via Card");
    }
}
