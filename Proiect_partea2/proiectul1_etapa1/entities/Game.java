package proiectul1_etapa1.entities;

import proiectul1_etapa1.services.audit;

import java.util.*;

public class Game {
    private int HP = 70;
    private int money = 1000;
    private int gems = 100;
    // it should be 2, if it is not 2 I forgot to chang eit after some tests, please put 2 there
    static private int timeOut = 2;
    private MyGunsHistory historyOfWeapons = new MyGunsHistory();
    private MyMeleeHistory historyOfMelees = new MyMeleeHistory();
    private ArrayList<Player> myPlayers= new ArrayList<>();
    private proiectul1_etapa1.services.audit audit = new audit();

    public Game(){}

    public Game(int HP, int money, int gems){
        this.HP = HP;
        this.money = money;
        this.gems = gems;
    }

    public void buyPlayerType(int type) throws InterruptedException {
        switch (type){
            case 1:
                FastPlayer player1 = new FastPlayer();
                this.myPlayers.add(player1);
                //System.out.println("\n\nTESTEZ DACA AM ADAUGAT CUM TREBUIE \n\n");
                //this.showMyPlayers();
                break;
            case 2:
                TankyPlayer player2 = new TankyPlayer();
                this.myPlayers.add(player2);
                //System.out.println("\n\nTESTEZ DACA AM ADAUGAT CUM TREBUIE \n\n");
                //this.showMyPlayers();
                break;
            case 3:
                SkilledPlayer player3 = new SkilledPlayer();
                this.myPlayers.add(player3);
                //System.out.println("\n\nTESTEZ DACA AM ADAUGAT CUM TREBUIE \n\n");
                //this.showMyPlayers();
                break;
        }
    }

    public void showTheSceneAndStats() throws InterruptedException {
        System.out.println("\n YOUR DATA:  HP: " + this.HP + "  MONEY: " + this.money + "  GEMS: " + this.gems + "\n");
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        Scenes scene = new Scenes();
        System.out.println("\nYOUR MISSION IS TO:\n");
        scene.showTheSituation();
        audit.addNewEvent("showTheSituation");
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        System.out.print("Because we have situation number "+ scene.getType() + " We will buy a : ");
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        this.buyPlayerType(scene.getType());
        audit.addNewEvent("buyPlayerType");
        int len = myPlayers.size();

        for (Player player : this.myPlayers){
            len--;
            if (len == 0){
                player.showTheChosenOne(scene.getType());
                audit.addNewEvent("showTheChosenOne");
                System.out.println("\n\nEvery new player bought has his weapons(Melee and Gun)! They are not very smart so they don't usually buy the best weapons for them!\n The weapons that the play has are:\n");
                java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
                int myGun = this.addPlayerAWeaponType();
                audit.addNewEvent("addPlayerAWeaponType");
                if (myGun == 1) {
                    player.getGuns().add(new MP5());
                    player.setGunICarry(player.getGuns().get(player.getGuns().size() - 1));
                    historyOfWeapons.weaponsHistory.add(player.getGunICarry());
                }
                else if (myGun == 2){
                    player.getGuns().add(new AK47());
                    player.setGunICarry(player.getGuns().get(player.getGuns().size() - 1));
                    historyOfWeapons.weaponsHistory.add(player.getGunICarry());
                }
                else{
                    player.getGuns().add(new AWP());
                    player.setGunICarry(player.getGuns().get(player.getGuns().size() - 1));
                    historyOfWeapons.weaponsHistory.add(player.getGunICarry());
                }


                int myMelee = this.addPlayerAWeaponType();
                if (myMelee == 1) {
                    player.getMelees().add(new Shovel());
                    player.setMeleeICarry(player.getMelees().get(player.getMelees().size() - 1));
                    this.historyOfMelees.meleesHistory.add(player.getMeleeICarry());
                }
                else if (myGun == 2){
                    player.getMelees().add(new Axe());
                    player.setMeleeICarry(player.getMelees().get(player.getMelees().size() - 1));
                    this.historyOfMelees.meleesHistory.add(player.getMeleeICarry());
                }

                else{
                    player.getMelees().add(new Knife());
                    player.setMeleeICarry(player.getMelees().get(player.getMelees().size() - 1));
                    this.historyOfMelees.meleesHistory.add(player.getMeleeICarry());
                }

                //player.setGunICarry(player.guns.get(0));
                player.buyGuns();
                audit.addNewEvent("buyGuns");
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
        System.out.println("We know it is stupid, but you have to send to mission your newest alive player! Don't blame me, blame the GOD of this game ^^!");
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        System.out.println("Your Players are this and we will sed to mission the last one from them: ");
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        showMyCandidate();
        System.out.println("\n The one above what you reed now, will go in mission :))\n");
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut);
        System.out.println("We just sent your player in the mission :D Our satellites are watching and in 4 seconds we will found out what happened ^^\n");
        //java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut + 2);

        len = myPlayers.size();

        for (Player player : this.myPlayers){
            len--;
            if (len == 0) {
                int points = scene.genereateWhatHappend(scene.getType(), player);
                HP += points;
                System.out.println("YOUR HP IS NOW:  " + HP);
                java.util.concurrent.TimeUnit.SECONDS.sleep(timeOut + 2);
                if (points < 0){
                    player.setName(player.getName() + "-> DEAD :'(");
                   // player.guns.remove(player.);
                   // player.melees.remove(player.melees.get(0));
                    //myPlayers.remove(player);
                }
            }
        }
    }
    public  void showMyCandidate()throws InterruptedException {

        int len = this.myPlayers.size();

        for (Player player : this.myPlayers) {
            len--;
            if (len == 0){
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("\n" + player.getName());
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
    }

    public void showMyPlayers() throws InterruptedException {
        int len = this.myPlayers.size();
        //System.out.println("@@@@@@Nr de playeri@@@@@@@@@@" + len);
        for (Player player : this.myPlayers) {
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("\n" + player.getName());
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

    public void showMyGunHistory(){
        this.historyOfWeapons.showWhatWeaponsIHad();
    }

    public void showMyMeleesHistory(){
        this.historyOfMelees.showWhatMeleesIHad();
    }

    public MyMeleeHistory getHistoryOfMelees() {
        return historyOfMelees;
    }

    public void setHistoryOfMelees(MyMeleeHistory historyOfMelees) {
        this.historyOfMelees = historyOfMelees;
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

    public static int getTimeOut() {
        return timeOut;
    }

    public static void setTimeOut(int timeOut) {
        Game.timeOut = timeOut;
    }

    public MyGunsHistory getHistoryOfWeapons() {
        return historyOfWeapons;
    }

    public void setHistoryOfWeapons(MyGunsHistory historyOfWeapons) {
        this.historyOfWeapons = historyOfWeapons;
    }

    public int getGems() {
        return gems;
    }

    public void setGems(int gems) {
        this.gems = gems;
    }

    public ArrayList<Player> getMyPlayers() {
        return myPlayers;
    }

    public void setMyPlayers(ArrayList<Player> myPlayers) {
        this.myPlayers = myPlayers;
    }
}
