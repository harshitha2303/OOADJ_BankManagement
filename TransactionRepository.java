package net.javaguides.bankmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.bankmanagementsystem.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    
}
