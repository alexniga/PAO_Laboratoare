package proiectul1_etapa1;

import java.util.HashSet;
import java.util.Scanner;

public class Game {
    int HP = 70;
    int money = 1000;
    int gems = 100;
    static private int timeOut = 0;
    MyGunsHistory historyOfWeapons = new MyGunsHistory();
    HashSet<Player> myPlayers= new HashSet<>();

    public Game(){}

    public Game(int HP, int money, int gems){
        this.HP = HP;
        this.money = money;
        this.gems = gems;
    }

    public void buyPlayerType(int type){
        switch (type){
            case 1:
                this.myPlayers.add(new FastPlayer());
                break;
            case 2:
                this.myPlayers.add(new TankyPlayer());
                break;
            case 3:
                this.myPlayers.add(new SkilledPlayer());
                break;
        }
    }

    public void showTheSceneAndStats() throws InterruptedException {
        System.out.println("\n YOUR DATA:  HP: " + this.HP + "  MONEY: " + this.money + "  GEMS: " + this.gems + "\n");
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        Scenes scene = new Scenes();
        System.out.println("\nYOUR MISSION IS TO:\n");
        scene.showTheSituation();
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        System.out.print("Because we have situation number "+ scene.type + " We will buy a : ");
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        this.buyPlayerType(scene.type);
        int len = myPlayers.size();

        for (Player player : this.myPlayers){
            len--;
            if (len == 0){
                player.showTheChosenOne(scene.type);
                System.out.println("\n\nEvery new player bought has his weapons(Melee and Gun)! They are not very smart so they don't usually buy the best weapons for them!\n The weapons that the play has are:\n");
                java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
                int myGun = this.addPlayerAWeaponType();
                if (myGun == 1) {
                    player.guns.add(new MP5());
                    player.setGunICarry(player.guns.get(player.guns.size() - 1));
                    historyOfWeapons.weaponsHistory.add(player.gunICarry);
                }
                else if (myGun == 2){
                    player.guns.add(new AK47());
                    player.setGunICarry(player.guns.get(player.guns.size() - 1));
                    historyOfWeapons.weaponsHistory.add(player.gunICarry);
                }
                else{
                    player.guns.add(new AWP());
                    player.setGunICarry(player.guns.get(player.guns.size() - 1));
                    historyOfWeapons.weaponsHistory.add(player.gunICarry);
                }


                int myMelee = this.addPlayerAWeaponType();
                if (myMelee == 1)
                    player.melees.add(new Shovel());
                else if (myGun == 2)
                    player.melees.add(new Axe());
                else
                    player.melees.add(new Knife());

                player.setMeleeICarry(player.melees.get(player.melees.size() - 1));
                player.setGunICarry(player.guns.get(0));
                player.buyGuns();
                player.buyMelees();
                player.updateMyAbilities();
                player.showMyPlayerWeapon();
                java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
                player.showMyPlayerMelee();
                java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
                System.out.println("\n And his abilities are:");
                java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
                player.showMyAbiilities();
            }
        }
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        System.out.println("We know it is stupid, but you have to send to mission your newest player! Don't blame me, blame the GOD of this game ^^!");
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        System.out.println("Your Players are this and we will sed to mission the last one from them: ");
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        showMyPlayers();
        System.out.println("\n The one above what you reed now, will go in mission :))\n");
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        System.out.println("We just sent your player in the mission :D Our satellites are watching and in 4 seconds we will found out what happened ^^\n");
        //java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut + 2);

        len = myPlayers.size();
        for (Player player : this.myPlayers){
            len--;
            if (len == 0) {
                int points = scene.genereateWhatHappend(scene.type, player);
                HP += points;
                System.out.println("YOUR HP IS NOW:  " + HP);
                java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut + 2);
                if (points < 0){
                   // player.guns.remove(player.);
                   // player.melees.remove(player.melees.get(0));
                    myPlayers.remove(player);
                }
            }
        }
    }


    public void showMyPlayers() throws InterruptedException {

        for (Player player : myPlayers) {
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("\n" + player.name);
            java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
            player.showMyPlayerWeapon();
            java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
            player.showMyPlayerMelee();
            java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
            System.out.println("\n And his abilities are:");
            player.showMyAbiilities();
            java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
            System.out.println("------------------------------------------------------------------------------");
        }
    }

    public int addPlayerAWeaponType() {
        SlotMachine machine = new SlotMachine();
        return machine.yourLuckyNumber(1,4);
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getGems() {
        return gems;
    }

    public void setGems(int gems) {
        this.gems = gems;
    }

    public HashSet<Player> getMyPlayers() {
        return myPlayers;
    }

    public void setMyPlayers(HashSet<Player> myPlayers) {
        this.myPlayers = myPlayers;
    }
}
