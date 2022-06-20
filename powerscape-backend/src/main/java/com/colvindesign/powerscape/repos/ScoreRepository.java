package com.colvindesign.powerscape.repos;

import com.colvindesign.powerscape.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
    List<Score> findAllByAccountId(Long accountId);
}
