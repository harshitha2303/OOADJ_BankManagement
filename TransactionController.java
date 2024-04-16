package net.javaguides.bankmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import net.javaguides.bankmanagementsystem.entity.Transaction;
import net.javaguides.bankmanagementsystem.service.TransactionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class TransactionController {
    
    @Autowired
    private TransactionService transactionService;
    @GetMapping("/transactions")
    public String listTransactions(Model model) {
        model.addAttribute("listTransactions", transactionService.getAllTransactions());
        return "transactions";
    }

    @GetMapping("/deposit")
    public String deposit(Model model) {
        Transaction transaction = new Transaction();
        model.addAttribute("transaction", transaction);
        return "deposit";
    }
    
    @PostMapping("/saveDeposit")
    public String saveDeposit(@ModelAttribute("transaction") Transaction transaction) {
        transactionService.saveTransaction(transaction);
        return "redirect:/transactions";
    }

    @GetMapping("/withdraw")
    public String withdraw(Model model) {
        Transaction transaction = new Transaction();
        model.addAttribute("transaction", transaction);
        return "withdraw";
    }

    @PostMapping("/saveWithdrawal")
    public String saveWithdrawal(@ModelAttribute("withdraw") Transaction transaction) {
        transactionService.saveTransaction(transaction);
        return "redirect:/transactions";
    }
}
