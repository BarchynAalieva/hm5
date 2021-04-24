package com.company;

public class Hero extends com.company.GameEntity {
    private String superAbility;

    public Hero(int health, int damage, String superAbility){
        super(health, damage);
        this.superAbility = superAbility;
    }

    public Hero(int health, String superAbility){
        super(health);
        this.superAbility = superAbility;
    }

    public String getSuperAbility() {
        return superAbility;
    }
}
