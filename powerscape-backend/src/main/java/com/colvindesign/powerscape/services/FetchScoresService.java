package com.colvindesign.powerscape.services;

import com.colvindesign.powerscape.model.Account;
import com.colvindesign.powerscape.model.Score;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FetchScoresService {
    @Value("${scores.api.url}")
    private String api;

    // This is extraordinarly lazy, but I just want to test the HTTPRequest atm TODO: Remove this :/
    private static String[] scoreNames = new String[]{
            "Overall",
            "Attack",
            "Defense",
            "Strength",
            "Hitpoints",
            "Ranged",
            "Prayer",
            "Magic",
            "Cooking",
            "Woodcutting",
            "Fletching",
            "Fishing",
            "Firemaking",
            "Crafting",
            "Smithing",
            "Mining",
            "Herblore",
            "Agility",
            "Thieving",
            "Slayer",
            "Farming",
            "Runecraft",
            "Hunter",
            "Construction"
    };

    public List<Score> fetchAllScores(List<Account> accounts){
        List<Score> allScores = new ArrayList<Score>();
        for(Account a: accounts){
            try {
                allScores.addAll(collectScore(a));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return allScores;
    }

    public List<Score> fetchScores(Account account){
        try{
            return collectScore(account);
        } catch (IOException e){
            e.printStackTrace();
        }

        return null;
    }

    public List<Score> collectScore(Account account) throws IOException {
        URL url = new URL(api+account.getUsername());

        HttpURLConnection c = (HttpURLConnection) url.openConnection();

        c.setRequestProperty("accept", "text/html");
        c.setRequestProperty("User-Agent", "Personal Score Tracker");

        InputStream response = c.getInputStream();

        List<Score> output = parseScores(response, account.getId());

        return output;
    }

    public List<Score> parseScores(InputStream inputStream, Long accountId){
        List<Score> scores = new ArrayList<>();
        try(inputStream){
            InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(reader);

            for(int i = 0; i < scoreNames.length; i++){
                String[] splitLine = bufferedReader.readLine().split(",");
                Score score = new Score(
                        accountId,
                        scoreNames[i],
                        Integer.parseInt(splitLine[0]),
                        Integer.parseInt(splitLine[1]),
                        Integer.parseInt(splitLine[2])
                );
                System.out.println(score.toString());
                scores.add(score);
            }

/*            // Read each Score line by line
            bufferedReader.lines().limit(24L).forEach(line -> {
                System.out.println(line);
                String[] splitLine = line.split(",");
                Score score = new Score(
                        accountId,
                        scoreNames[linecount],
                        Integer.parseInt(splitLine[0]),
                        Integer.parseInt(splitLine[1]),
                        Integer.parseInt(splitLine[2])
                );
                scores.add(score);
            });*/

        } catch (IOException e) {
            e.printStackTrace();
        }

        return scores;
    }
}
