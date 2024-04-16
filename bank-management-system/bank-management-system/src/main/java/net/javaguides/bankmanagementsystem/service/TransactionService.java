package net.javaguides.bankmanagementsystem.service;

import java.util.*;

import net.javaguides.bankmanagementsystem.entity.Transaction;

public interface TransactionService {
    List<Transaction> getAllTransactions();
    void saveTransaction(Transaction transaction);
}
