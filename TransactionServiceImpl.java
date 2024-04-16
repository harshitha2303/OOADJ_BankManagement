package net.javaguides.bankmanagementsystem.service.impl;

import net.javaguides.bankmanagementsystem.entity.Transaction;
import net.javaguides.bankmanagementsystem.repository.TransactionRepository;
import net.javaguides.bankmanagementsystem.service.TransactionService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService{
    
    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public void saveTransaction(Transaction transaction) {
        this.transactionRepository.save(transaction);
    }
}
