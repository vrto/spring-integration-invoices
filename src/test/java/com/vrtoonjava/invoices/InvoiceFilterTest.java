package com.vrtoonjava.invoices;

import org.testng.annotations.Test;

import java.math.BigDecimal;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class InvoiceFilterTest {

    @Test
    public void testAccept() {
        InvoiceFilter filter = new InvoiceFilter();

        assertTrue(filter.accept(invoice("0")));
        assertTrue(filter.accept(invoice("100")));
        assertTrue(filter.accept(invoice("9999")));

        assertFalse(filter.accept(invoice("10000")));
        assertFalse(filter.accept(invoice("100000")));
        assertFalse(filter.accept(invoice("13337")));
    }

    private Invoice invoice(String amount) {
        return new Invoice("some-iban", "some-addr", "some-acc", new BigDecimal(amount));
    }

}
