package com.colvindesign.powerscape.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

/***
 * I plan to replace this at a later time using Auth0 or similar service.
 * For now, I am keeping this plain text for testing purposes. NO actual private information will be logged
 */

@Entity(name = "PSusers")
@Table
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    //private String salt;

    public User(long id) {
        this.id = id;
    }




}
