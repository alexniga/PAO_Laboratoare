package proiectul1_etapa1.entities;

import java.util.ArrayList;

public class Player {

    private ArrayList<String> abilites = new ArrayList<>();
    private String name;
    private int speed, muscles, health;
    private ArrayList<Gun> guns = new ArrayList<>();
    private ArrayList<Melee> melees = new ArrayList<>();
    private ArrayList<Gun> gunsICarry = new ArrayList<>();
    private Melee meleeICarry = new Melee();
    private Gun gunICarry = new Gun();

    public Player(){}

    public Player(String name, int speed, int muscles, int health){
        this.name = name;
        this.speed = speed;
        this.muscles = muscles;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Gun> getGuns() {
        return guns;
    }

    public void setGuns(ArrayList<Gun> guns) {
        this.guns = guns;
    }

    public ArrayList<Melee> getMelees() {
        return melees;
    }

    public void setMelees(ArrayList<Melee> melees) {
        this.melees = melees;
    }

    public ArrayList<Gun> getGunsICarry() {
        return gunsICarry;
    }

    public void setGunsICarry(ArrayList<Gun> gunsICarry) {
        this.gunsICarry = gunsICarry;
    }

    public Melee getMeleeICarry() {
        return meleeICarry;
    }

    public void setMeleeICarry(Melee meleeICarry) {
        this.meleeICarry = meleeICarry;
    }

    public Gun getGunICarry() {
        return gunICarry;
    }

    public void setGunICarry(Gun gunICarry) {
        this.gunICarry = gunICarry;
    }

    public ArrayList<String> getAbilites() {
        return abilites;
    }

    public void setAbilites(ArrayList<String> abilites) {
        this.abilites = abilites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMuscles() {
        return muscles;
    }

    public void setMuscles(int muscles) {
        this.muscles = muscles;
    }

    public void buyGuns(){
        for (Gun gun : guns){
            gun.buyMyGun();
            gun.calculateMyBattleChances();
        }
    }

    public void showMyPlayerWeapon(){
//        int len = guns.size();
//        for (Gun gun : guns){
//            len--;
//            if(len == 0){
//                gun.showMyGun();
//                gun.showMyBattleStats();
//            }
//        }
        this.gunICarry.showMyGun();
        this.gunICarry.showMyBattleStats();
    }

    public void showMyWeapons(){
        for (Gun gun : guns){
            gun.showMyGun();
            gun.showMyBattleStats();
        }
    }

    public void showMyBattleStats(){
        for (Gun gun : guns){
            gun.showMyBattleStats();
        }
    }

    public void buyMelees(){
        for (Melee melee: melees){
            melee.buyMelee();
        }
    }

    public void showMyMelees(){
        for (Melee melee : melees){
            melee.showMyStats();
        }
    }
    public void showMyPlayerMelee(){
        meleeICarry.showMyStats();
    }

    public void updateMyPlayerTypeAbilities(){}

    public void updateMyAbilities(){
        for (String abilitie : this.meleeICarry.abilites){
                this.abilites.add(abilitie);
        }
        updateMyPlayerTypeAbilities();
    }

    public void showMyAbiilities(){
        System.out.print("\n");
        for(String abilite : abilites){
            System.out.print(" | " + abilite);
        }
        System.out.print("| \n");
    }

    public void lvlUpOneGun(int stat, Gun gun){
        switch (stat){
            case 1:
                gun.stats.setHighNumberOfEnemies(gun.stats.getHighNumberOfEnemies() + gun.stats.getHighNumberOfEnemies() * 0.1);
                break;
            case 2:
                gun.stats.setLowNumberOfEnemies(gun.stats.getLowNumberOfEnemies() + gun.stats.getLowNumberOfEnemies() * 0.1);
                break;
            case 3:
                gun.stats.setHighDistanceEnemy(gun.stats.getHighDistanceEnemy() + gun.stats.getHighDistanceEnemy() * 0.1);
                break;
            case 4:
                gun.stats.setShortDistanceEnemy(gun.stats.getShortDistanceEnemy() + gun.stats.getShortDistanceEnemy() * 0.1);
                break;
            case 5:
                gun.stats.setSprint(gun.stats.getSprint() + gun.stats.getSprint() * 0.1);
                break;
        }
    }

    public void lvlUpMyMelee(int stat, Melee melee){
        switch (stat){
            case 1:
                melee.slash += melee.slash * 0.1;
                break;
            case 2:
                melee.dig += melee.dig * 0.1;
                break;
            case 3:
                melee.chop += melee.chop * 0.1;
                break;
        }
    }

    public void showTheChosenOne(int i){
        switch (i){
            case 1:
                name = "FastPlayer";
                System.out.print("FastPlayer");
                break;
            case 2:
                name = "TankyPlayer";
                System.out.print("TankyPlayer");
                break;
            case 3:
                name = "SkilledPlayer";
                System.out.print("SkilledPlayer");
                break;
        }
    }

}
