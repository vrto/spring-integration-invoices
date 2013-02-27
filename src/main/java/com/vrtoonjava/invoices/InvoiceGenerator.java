package com.vrtoonjava.invoices;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Utility class for generating invoices.
 */
@Component
public class InvoiceGenerator {

    private Random rand = new Random();

    public Invoice nextInvoice() {
        return new Invoice(rand.nextBoolean() ? iban() : null, address(), account(), dollars());
    }

    private BigDecimal dollars() {
        return new BigDecimal(1 + rand.nextInt(20_000));
    }

    private String account() {
        return "test-account " + rand.nextInt(1000) + 1000;
    }

    private String address() {
        return "Test Street " + rand.nextInt(100) + 1;
    }

    private String iban() {
        return "test-iban-" + rand.nextInt(1000) + 1000;
    }

}
