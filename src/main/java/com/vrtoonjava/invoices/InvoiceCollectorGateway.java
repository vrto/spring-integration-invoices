package com.vrtoonjava.invoices;

import java.util.Collection;

/**
 * Defines a contract that decouples client from the Spring Integration framework.
 */
public interface InvoiceCollectorGateway {

    void collectInvoices(Collection<Invoice> invoices);

}
