package net.javaguides.bankmanagementsystem.service.impl;

import java.util.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import net.javaguides.bankmanagementsystem.entity.Transaction;
import net.javaguides.bankmanagementsystem.repository.TransactionRepo;
import net.javaguides.bankmanagementsystem.service.TransactionService;

@Service
@Transactional
public class TransactionImpl implements TransactionService{
    @Autowired
    private TransactionRepo transactionRepo;

    // @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepo.findAll();
    }
    
    public void deposit(Long accountFrom, Long accountTo, BigDecimal amount) {
        Transaction transaction = new Transaction();
        transaction.setType("Deposit");
        transaction.setAmount(amount);
        transaction.setAcFrom(accountFrom);
        transaction.setAcTo(accountTo);
        transaction.setTimestamp(LocalDateTime.now());
        transaction.setStatus("Success");
        
        transactionRepo.save(transaction);
    }

    public void withdraw(Long accountID, BigDecimal amount) {
        Transaction transaction = new Transaction();
        transaction.setType("Withdrawal");
        transaction.setAmount(amount);
        transaction.setAcFrom(accountID); 
        transaction.setTimestamp(LocalDateTime.now());
        transaction.setStatus("Success");
        
        transactionRepo.save(transaction);
    }

    public void transfer(Long fromAccountID, Long toAccountID, BigDecimal amount) {
        Transaction fromTransaction = new Transaction();
        fromTransaction.setType("Transfer");
        fromTransaction.setAmount(amount);
        fromTransaction.setAcFrom(fromAccountID);
        fromTransaction.setAcTo(toAccountID);
        fromTransaction.setTimestamp(LocalDateTime.now());
        fromTransaction.setStatus("Success");
        
        Transaction toTransaction = new Transaction();
        toTransaction.setType("Transfer");
        toTransaction.setAmount(amount);
        toTransaction.setAcFrom(fromAccountID); 
        toTransaction.setAcTo(toAccountID);
        toTransaction.setTimestamp(LocalDateTime.now());
        toTransaction.setStatus("Success");
        
        transactionRepo.save(fromTransaction);
        transactionRepo.save(toTransaction);
    }
}
