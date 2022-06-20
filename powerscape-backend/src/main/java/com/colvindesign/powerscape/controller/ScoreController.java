package com.colvindesign.powerscape.controller;

import com.colvindesign.powerscape.model.Score;
import com.colvindesign.powerscape.services.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/***
 * Controller which handles requests for account scores. Get only.
 *
 * NO DELETIONS ALLOWED as to maintain a proper historial record of changes.
 *
 * Any additions to our score DB are done soley through the backend, therefore no api endpoint shall
 * exist to add scores
 */
@RestController
@RequestMapping(path = "api/v1/scores")
public class ScoreController {
    private final ScoreService scoreService;

    @Autowired
    public ScoreController(ScoreService scoreService){
        this.scoreService = scoreService;
    }

    @GetMapping(path="{accountId}")
    public List<Score> getScoresByAccountId(@PathVariable("accountId") Long accountId){
        return scoreService.getScoresByAccount(accountId);
    }

}
