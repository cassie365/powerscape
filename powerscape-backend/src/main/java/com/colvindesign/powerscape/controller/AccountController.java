package com.colvindesign.powerscape.controller;


import com.colvindesign.powerscape.model.Account;
import com.colvindesign.powerscape.services.AccountService;
import com.colvindesign.powerscape.services.FetchScoresService;
import com.colvindesign.powerscape.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller which takes requests and returns account related information
 * An account is an OSRS account which belongs to a user
 *
 */

@RestController
@RequestMapping(path = "api/v1/accounts")
public class AccountController {
    private final AccountService accountService;
    private final FetchScoresService fetchScoresService;
    private final ScoreService scoreService;

    @Autowired
    public AccountController (AccountService accountService, FetchScoresService fetchScoresService, ScoreService scoreService){
        this.accountService = accountService;
        this.fetchScoresService = fetchScoresService;
        this.scoreService = scoreService;
    }

    // TODO: Add some handling incase of failure
    @PostMapping
    public void registerAccount(@RequestBody Account account){
        accountService.addAccount(account);
        scoreService.addScores(fetchScoresService.fetchScores(account));
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
