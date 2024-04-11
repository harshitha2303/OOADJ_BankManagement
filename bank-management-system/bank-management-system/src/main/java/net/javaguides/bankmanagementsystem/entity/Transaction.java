package net.javaguides.bankmanagementsystem.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column(name = "Type", nullable = false)
    private String type;
    // @Column(name = "Amount", nullable = true)
    private BigDecimal amount;
    // @Column(name = "FromAccount", nullable = false)
    private Long acFrom; // Assuming acFrom is the ID of the account
    // @Column(name = "ToAccount", nullable = false)
    private Long acTo; // Assuming acTo is the ID of the account
    // @Column(name = "Timestamp", nullable = false)
    private LocalDateTime timestamp;
    // @Column(name = "Status", nullable = false)
    private String status;
    
    public Transaction() {

    }

    public Transaction(Long id, String type, BigDecimal amount, Long acFrom, Long acTo, LocalDateTime timestamp, String status) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.acFrom = acFrom;
        this.acTo = acTo;
        this.timestamp = timestamp;
        this.status = status;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
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
    public LocalDateTime getTimestamp() {
    return timestamp;
}

public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
}

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
