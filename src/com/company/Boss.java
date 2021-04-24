package com.company;

public class Boss extends com.company.GameEntity {
    private String defense;
    private com.company.Weapon weapon;

    public com.company.Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(com.company.Weapon weapon) {
        this.weapon = weapon;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }
}