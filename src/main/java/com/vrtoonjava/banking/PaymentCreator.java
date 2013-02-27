package com.vrtoonjava.banking;

import com.vrtoonjava.invoices.Invoice;

/**
 * Creates payment for bank from the invoice.
 * Real world implementation might do some I/O expensive stuff.
 */
public interface PaymentCreator {

    Payment createPayment(Invoice invoice) throws PaymentException;

}
