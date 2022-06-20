package com.colvindesign.powerscape.services;

import com.colvindesign.powerscape.model.Account;
import com.colvindesign.powerscape.repos.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    //Add a new account
    public void addAccount(Account account){
        accountRepository.save(account);
    }

    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    public Account getAccount(Long id){
        Optional<Account> account = accountRepository.findById(id);

        if(account.isPresent())
            return account.get();
        else
            throw new IllegalStateException("No Account Found!");
    }
}
