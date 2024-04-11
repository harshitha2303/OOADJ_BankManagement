package net.javaguides.bankmanagementsystem.controller;

import java.math.BigDecimal;

public class TransferRequest {
    private Long fromAccountID;
    private Long toAccountID;
    private BigDecimal amount;

    public Long getFromAccountID() {
        return fromAccountID;
    }

    public void setFromAccountID(Long fromAccountID) {
        this.fromAccountID = fromAccountID;
    }

    public Long getToAccountID() {
        return toAccountID;
    }

    public void setToAccountID(Long toAccountID) {
        this.toAccountID = toAccountID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}