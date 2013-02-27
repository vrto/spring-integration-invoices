package com.vrtoonjava.banking;

import com.google.common.base.Objects;

import java.math.BigDecimal;

public class Payment {

    private final String senderAccount;
    private final String receiverAccount;
    private final BigDecimal dollars;

    public Payment(String senderAccount, String receiverAccount, BigDecimal dollars) {
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.dollars = dollars;
    }

    public String getSenderAccount() {
        return senderAccount;
    }

    public String getReceiverAccount() {
        return receiverAccount;
    }

    public BigDecimal getDollars() {
        return dollars;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("senderAccount", senderAccount)
                .add("receiverAccount", receiverAccount)
                .add("dollars", dollars)
                .toString();
    }

}
