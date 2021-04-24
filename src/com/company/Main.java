package com.company;

public class Main {

    public static void main(String[] args) {

        Hero mag =new Hero(250, 50, "Magic");
        Hero medic =new Hero(180, "Heal");
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(55);
        boss.setDefense("Mag");

        Weapon weapon = new Weapon();
        weapon.setName("Weapon");
        weapon.setType("Automatic");
        boss.setWeapon(weapon);
        System.out.println(boss.getHealth() +
                " " + boss.getDamage() +
                " " + boss.getDefense()+
                " " + boss.getWeapon().getType()+
                " " + boss.getWeapon().getName());
    }
}
