package com.colvindesign.powerscape.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * Controller which handles requests for account scores. Get only.
 *
 * NO DELETIONS ALLOWED as to maintain a proper historial record of changes.
 *
 * Any additions to our score DB are done soley through the backend, therefore no api endpoint shall
 * exist to add scores
 */
@RestController
@RequestMapping(path = "api/v1/score")
public class ScoreController {
    // Get all scores by account id

    // Get score by id
}
