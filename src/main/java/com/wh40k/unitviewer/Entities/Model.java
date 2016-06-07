package com.wh40k.unitviewer.Entities;

import javax.persistence.*;

/**
 * Created by Ultramar on 6/6/16.
 */
@Entity
@Table(name = "models")
public class Model {

    @Id
    @GeneratedValue
    int id;

    @Column
    String name;

    @Column
    int shootingSkill;

    @Column
    int meleeSkill;

    @Column
    int toughness;

    @Column
    int leadership;

    @Column
    String army;

    public int getShootingSkill() {
        return shootingSkill;
    }

    public void setShootingSkill(int shootingSkill) {
        this.shootingSkill = shootingSkill;
    }

    public int getMeleeSkill() {
        return meleeSkill;
    }

    public void setMeleeSkill(int meleeSkill) {
        this.meleeSkill = meleeSkill;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getLeadership() {
        return leadership;
    }

    public void setLeadership(int leadership) {
        this.leadership = leadership;
    }

    public String getArmy() {
        return army;
    }

    public void setArmy(String army) {
        this.army = army;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model() {
    }

    public Model(String name, int shootingSkill, int meleeSkill, int toughness, int leadership, String army) {
        this.shootingSkill = shootingSkill;
        this.meleeSkill = meleeSkill;
        this.toughness = toughness;
        this.leadership = leadership;
        this.army = army;
        this.name = name;
    }
}
