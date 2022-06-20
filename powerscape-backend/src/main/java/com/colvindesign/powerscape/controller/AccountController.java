package com.colvindesign.powerscape.controller;


import com.colvindesign.powerscape.model.Account;
import com.colvindesign.powerscape.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller which takes requests and returns account related information
 * An account is an OSRS account which belongs to a user
 *
 */

@RestController
@RequestMapping(path = "api/v1/account")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController (AccountService accountService){
        this.accountService = accountService;
    }

    @PostMapping
    public void registerAccount(@RequestBody Account account){
        accountService.addAccount(account);
    }

    @GetMapping
    public List<Account> getAccounts(){
        return accountService.getAllAccounts();
    }

    @GetMapping(path = "{accountId}")
    public Account getAccount(@PathVariable("accountId") Long accountId){
        return accountService.getAccount(accountId);
    }

}
