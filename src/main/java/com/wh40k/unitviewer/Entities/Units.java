package com.wh40k.unitviewer.Entities;

import javax.persistence.*;


@Entity
@Table(name = "models")
public class Units {

    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    int shootingSkill;

    @Column(nullable = false)
    int meleeSkill;

    @Column(nullable = false)
    int toughness;

    @Column
    int leadership;

    @Column(nullable = false)
    String army;

    @Column(nullable = false)
    String image;

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Units() {
    }

    public Units(String name, int shootingSkill, int meleeSkill, int toughness, int leadership, String army, String image) {
        this.shootingSkill = shootingSkill;
        this.meleeSkill = meleeSkill;
        this.toughness = toughness;
        this.leadership = leadership;
        this.army = army;
        this.name = name;
        this.image = image;
    }
}
