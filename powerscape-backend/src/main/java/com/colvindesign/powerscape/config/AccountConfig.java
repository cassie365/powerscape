package com.colvindesign.powerscape.config;

import com.colvindesign.powerscape.model.Account;
import com.colvindesign.powerscape.repos.AccountRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/***
 * Configuration to pre-populate the database with some accounts
 * Just for testing purposes while in DEV env
 */
@Configuration
public class AccountConfig {
    @Value("${testers.username}")
    private String testUser;

    @Bean
    CommandLineRunner commandLineRunner(AccountRepository accountRepository){
        return args -> {
            Account test1 = new Account(testUser);

            accountRepository.save(test1);
        };
    }
}
