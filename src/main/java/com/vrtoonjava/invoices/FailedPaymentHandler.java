package com.vrtoonjava.invoices;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class FailedPaymentHandler {

    @ServiceActivator
    public void handleFailedPayment(Exception e) {
        System.out.println("Payment failed: " + e);
        // now the system should do something reasonable, like retrying the payment
        // omitted for the tutorial purposes
    }

}
