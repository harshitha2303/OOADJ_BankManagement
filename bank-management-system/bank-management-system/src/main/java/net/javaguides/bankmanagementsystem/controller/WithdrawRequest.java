package net.javaguides.bankmanagementsystem.controller;

import java.math.BigDecimal;

public class WithdrawRequest {
    private Long accountID;
    private BigDecimal amount;

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
