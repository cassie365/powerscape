package com.colvindesign.powerscape.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class ScheduledTasks {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    private static final String statsURL = "https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player=";

    /***
     * Scheduled API call to jagex's highscores website. This data will populate my accounts table in the DB
     *
     * Replace current cron expression with @daily for prod
     */
    @Scheduled(cron="*/10 * * * * *")
    public void fetchAccountStats(){


    }

}
