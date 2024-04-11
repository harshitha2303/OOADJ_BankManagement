package net.javaguides.bankmanagementsystem.controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class DepositRequest {
    private Long id;
    private String type;
    private BigDecimal amount;
    private Long acFrom; 
    private Long acTo; 
    private LocalDateTime timestamp;
    private String status;
    
    public Long getID() {
        return id;
    } 
    public void setID(Long id) {
        this.id = id;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public Long getAcFrom() {
        return acFrom;
    }
    public void setAcFrom(Long acFrom) {
        this.acFrom = acFrom;
    }
    public Long getAcTo() {
        return acTo;
    }
    public void setAcTo(Long acTo) {
        this.acTo = acTo;
    }
    public LocalDateTime getTimeStamp() {
        return timestamp;
    }
}