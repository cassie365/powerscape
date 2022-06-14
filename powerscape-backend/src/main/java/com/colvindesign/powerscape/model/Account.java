package com.colvindesign.powerscape.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    private long userId;
    private String username;

    public Account(Long id, long userId, String username) {
        this.id = id;
        this.userId = userId;
        this.username = username;
    }

    public Account(long userId, String username) {
        this.userId = userId;
        this.username = username;
    }
}
