package com.colvindesign.powerscape.model;

import java.time.LocalDateTime;

/**
 * Represents all of the skills a player can have, and a timestamp of when skills were recorded.
 */
public class Skill {
    private long id;
    private long accountId;

    private int attack;
    private int strength;
    private int defense;
    private int ranged;
    private int prayer;
    private int magic;
    private int runecraft;
    private int construction;
    private int hitpoints;
    private int agility;
    private int herblore;
    private int theiving;
    private int crafting;
    private int fletching;
    private int slayer;
    private int hunter;
    private int mining;
    private int smithing;
    private int fishing;
    private int cooking;
    private int firemaking;
    private int woodcutting;
    private int farming;
    private LocalDateTime timestamp;
}
