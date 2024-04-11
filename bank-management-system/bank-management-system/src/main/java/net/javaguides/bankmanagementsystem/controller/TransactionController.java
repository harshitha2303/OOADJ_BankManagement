package net.javaguides.bankmanagementsystem.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

import net.javaguides.bankmanagementsystem.entity.Transaction;
import net.javaguides.bankmanagementsystem.service.TransactionService;

@Controller
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping({"", "/"})
    public String listTransactions(Model model) {
        List<Transaction> transactions = transactionService.getAllTransactions();
        model.addAttribute("transactions", transactions);
        return "transactions";
    }

    @PostMapping("/deposit")
    public ResponseEntity<String> deposit(DepositRequest request) {
        transactionService.deposit(request.getAcFrom(), request.getAcTo(), request.getAmount());
        return ResponseEntity.ok("Deposit successful");
    }

    @PostMapping("/withdraw")
    public ResponseEntity<String> withdraw(WithdrawRequest request) {
        transactionService.withdraw(request.getAccountID(), request.getAmount());
        return ResponseEntity.ok("Withdrawal successful");
    }

    @PostMapping("/transfer")
    public ResponseEntity<String> transfer(TransferRequest request) {
        transactionService.transfer(request.getFromAccountID(), request.getToAccountID(), request.getAmount());
        return ResponseEntity.ok("Transfer successful");
    }
}