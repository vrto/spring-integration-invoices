package com.vrtoonjava.invoices;

import org.springframework.integration.annotation.Filter;
import org.springframework.stereotype.Component;

@Component
public class InvoiceFilter {

    public static final int LOW_ENOUGH_THRESHOLD = 10_000;

    @Filter
    public boolean accept(Invoice invoice) {
        boolean lowEnough = invoice.getDollars().intValue() < LOW_ENOUGH_THRESHOLD;
        System.out.println("Amount of $" + invoice.getDollars()
                + (lowEnough ? " can" : " can not") + " be automatically processed by system");

        return lowEnough;
    }

}
