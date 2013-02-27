package com.vrtoonjava.invoices;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point of the application.
 * Creates Spring context, lets Spring to schedule job and use schema.
 */
public class InvoicesApplication {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("/invoices-context.xml");
    }

}
