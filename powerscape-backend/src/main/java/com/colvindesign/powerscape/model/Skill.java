package com.colvindesign.powerscape.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDateTime;

/**
 * Represents all of the skills a player can have, and a timestamp of when skills were recorded.
 */

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Skill {
    @Id
    @GeneratedValue
    private Long id;
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

    //May change method of generating this in future, for now I want the database to tell use what time it is
    @Column(name = "timestamp", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date timestamp;

    public Skill(Long id, long accountId, int attack, int strength, int defense, int ranged, int prayer, int magic, int runecraft, int construction, int hitpoints, int agility, int herblore, int theiving, int crafting, int fletching, int slayer, int hunter, int mining, int smithing, int fishing, int cooking, int firemaking, int woodcutting, int farming) {
        this.id = id;
        this.accountId = accountId;
        this.attack = attack;
        this.strength = strength;
        this.defense = defense;
        this.ranged = ranged;
        this.prayer = prayer;
        this.magic = magic;
        this.runecraft = runecraft;
        this.construction = construction;
        this.hitpoints = hitpoints;
        this.agility = agility;
        this.herblore = herblore;
        this.theiving = theiving;
        this.crafting = crafting;
        this.fletching = fletching;
        this.slayer = slayer;
        this.hunter = hunter;
        this.mining = mining;
        this.smithing = smithing;
        this.fishing = fishing;
        this.cooking = cooking;
        this.firemaking = firemaking;
        this.woodcutting = woodcutting;
        this.farming = farming;
    }

    public Skill(long accountId, int attack, int strength, int defense, int ranged, int prayer, int magic, int runecraft, int construction, int hitpoints, int agility, int herblore, int theiving, int crafting, int fletching, int slayer, int hunter, int mining, int smithing, int fishing, int cooking, int firemaking, int woodcutting, int farming) {
        this.accountId = accountId;
        this.attack = attack;
        this.strength = strength;
        this.defense = defense;
        this.ranged = ranged;
        this.prayer = prayer;
        this.magic = magic;
        this.runecraft = runecraft;
        this.construction = construction;
        this.hitpoints = hitpoints;
        this.agility = agility;
        this.herblore = herblore;
        this.theiving = theiving;
        this.crafting = crafting;
        this.fletching = fletching;
        this.slayer = slayer;
        this.hunter = hunter;
        this.mining = mining;
        this.smithing = smithing;
        this.fishing = fishing;
        this.cooking = cooking;
        this.firemaking = firemaking;
        this.woodcutting = woodcutting;
        this.farming = farming;
    }
}
