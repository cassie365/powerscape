package com.colvindesign.powerscape.services;

import com.colvindesign.powerscape.model.Score;
import com.colvindesign.powerscape.repos.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    private final ScoreRepository scoreRepository;

    @Autowired
    public ScoreService(ScoreRepository scoreRepository){
        this.scoreRepository=scoreRepository;
    }

    public List<Score> getScoresByAccount(Long accountID){
        return scoreRepository.findAllByAccountId(accountID);
    }

    //Protected method to be used only by the FetchScoresService. No direct access allowed.
    protected void addScores (List<Score> scores){
        scoreRepository.saveAll(scores);
    }

}
