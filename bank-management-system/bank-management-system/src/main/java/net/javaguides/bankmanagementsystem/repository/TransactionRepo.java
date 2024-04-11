package net.javaguides.bankmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.bankmanagementsystem.entity.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction,Long> {
    
}
