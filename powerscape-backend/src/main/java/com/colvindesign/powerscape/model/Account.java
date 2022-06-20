package com.colvindesign.powerscape.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/***
 * An account which we want to monitor progress for. Associate with one osrs account
 */
@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private boolean isTracked;

    public Account(Long id, String username) {
        this.id = id;
        this.username = username;
        isTracked = true;
    }

    public Account( String username) {
        this.username = username;
        isTracked = true;
    }
}
