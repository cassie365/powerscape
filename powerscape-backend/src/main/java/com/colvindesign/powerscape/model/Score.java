package com.colvindesign.powerscape.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/***
 * Represents an individual score of an account
 *
 * Originally wanted to have a score sheet, but because of the detail I have on each score, I have seperated everything
 * out
 */

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
//@Data
public class Score {
    @Id
    @GeneratedValue
    private Long id;
    private Long accountId;
    private String name;
    private int rank;
    private int level;
    private int xp;

    @CreationTimestamp
    private Timestamp timestamp;

    public Score(Long id, Long accountId, String name, int rank, int level, int xp) {
        this.id = id;
        this.accountId = accountId;
        this.name = name;
        this.rank = rank;
        this.level = level;
        this.xp = xp;
    }

    public Score(Long accountId, String name, int rank, int level, int xp) {
        this.accountId = accountId;
        this.name = name;
        this.rank = rank;
        this.level = level;
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id=" + id +
                ", accountId=" + accountId +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                ", level=" + level +
                ", xp=" + xp +
                ", timestamp=" + timestamp +
                '}';
    }
}
