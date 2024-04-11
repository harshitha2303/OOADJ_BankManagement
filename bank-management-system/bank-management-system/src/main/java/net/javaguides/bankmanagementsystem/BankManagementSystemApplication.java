package net.javaguides.bankmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javaguides.bankmanagementsystem.entity.Transaction;
import net.javaguides.bankmanagementsystem.entity.User;
import net.javaguides.bankmanagementsystem.repository.Userrepository;

@SpringBootApplication
public class BankManagementSystemApplication implements CommandLineRunner {

    @Autowired
    private Userrepository userRepository;

    private static BankManagementSystemApplication instance;

    public BankManagementSystemApplication() {
        // Private constructor to prevent instantiation from outside
    }
    
    // SINGLETON DESIGN PATTERN USED 
    public static synchronized BankManagementSystemApplication getInstance() {
        if (instance == null) {
            instance = new BankManagementSystemApplication();
        }
        return instance;
    }

    public static void main(String[] args) {
        BankManagementSystemApplication.getInstance().start(args);
    }

    private void start(String[] args) {
        SpringApplication.run(BankManagementSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("Harshitha", "Sai_913", "har@gmail.com");
        userRepository.save(user1);

        User user2 = new User("Siri", "H_V_911", "siri@gmail.com");
        userRepository.save(user2);

        User user3 = new User("Sanath", "Kumar_463", "san@gmail.com");
        userRepository.save(user3);

        // Transaction t1 = new Transaction("1","deposit","5000",)
    }
}