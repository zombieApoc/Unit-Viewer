package com.wh40k.unitviewer.Entities;

/**
 * Created by Ultramar on 6/6/16.
 */
public class Model {
    public int shootingSkill;
    public int meleeSkill;
    public int toughness;
    public int leadership;
    public String army;

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

    public Model() {
    }

    public Model(int shootingSkill, int meleeSkill, int toughness, int leadership, String army) {
        this.shootingSkill = shootingSkill;
        this.meleeSkill = meleeSkill;
        this.toughness = toughness;
        this.leadership = leadership;
        this.army = army;
    }
}
