package com.vrtoonjava.banking;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Mock service that simulates some banking behavior.
 * In real world, we might use some web service or a proxy of real service.
 */
@Service
public class MockBankingService implements BankingService {

    private final Random rand = new Random();

    @Override
    public void pay(Payment payment) throws PaymentException {
        if (rand.nextDouble() > 0.9) {
            throw new PaymentException("Banking services are offline, try again later!");
        }

        System.out.println("Processing payment " + payment);
    }

}
