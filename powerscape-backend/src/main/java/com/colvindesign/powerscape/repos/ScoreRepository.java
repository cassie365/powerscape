package com.colvindesign.powerscape.repos;

import com.colvindesign.powerscape.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
    // Get most recent score by name

    // Add score
}
