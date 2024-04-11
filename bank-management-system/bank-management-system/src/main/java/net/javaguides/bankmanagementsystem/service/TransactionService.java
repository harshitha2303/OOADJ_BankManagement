package net.javaguides.bankmanagementsystem.service;

import java.util.*;
import java.math.BigDecimal;

import net.javaguides.bankmanagementsystem.entity.Transaction;

public interface TransactionService {
    List<Transaction> getAllTransactions();
    void deposit(Long accountFrom, Long accountTo, BigDecimal amount);
    void withdraw(Long accountID, BigDecimal amount);
    void transfer(Long fromAccountID, Long toAccountID, BigDecimal amount);
}