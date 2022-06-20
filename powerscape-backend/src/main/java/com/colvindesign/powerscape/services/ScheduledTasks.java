package com.colvindesign.powerscape.services;

import com.colvindesign.powerscape.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.List;

@Component
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private static final String statsURL = "https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player=";

    private final ScoreService scoreService;
    private final AccountService accountService;
    private final FetchScoresService fetchScoresService;

    @Autowired
    public ScheduledTasks(ScoreService scoreService, AccountService accountService, FetchScoresService fetchScoresService){
        this.scoreService = scoreService;
        this.accountService = accountService;
        this.fetchScoresService = fetchScoresService;
    }

    /***
     * Scheduled API call to jagex's highscores website. This data will populate my accounts table in the DB
     *
     * Replace current cron expression with @daily for prod
     *
     */
    @Scheduled(cron="*/20 * * * * *")
    public void fetchAccountStats(){
        // Query DB for all accounts
        List<Account> accounts = accountService.getAllAccounts();

        // Give accounts to fetch service to perform API calls
        scoreService.addScores(fetchScoresService.fetchScores(accounts));
    }

}
