package proiectul1_etapa1.entities;

public class Scenes {

    private static int quickAndSafe = 1;
    private static int atackAndDestroy = 2;
    private static int scoutAndSearch = 3;
    private int type;
    private String situation;

    public Scenes() {
        SlotMachine machine = new SlotMachine();
        type = machine.yourLuckyNumber(1, 4);
        switch (type) {
            case 1:
                situation = "Go quick and safe!\n";
                break;
            case 2:
                situation = "GO THERE AND DESTROY EVERYTHING!\n";
                break;
            case 3:
                situation = "Go scout and search the area!\n";
                break;
        }
    }

    public void showTheSituation() {
        System.out.println(type + ". " + situation);
    }

    public int genereateWhatHappend(int type, Player player) {
        SlotMachine machine = new SlotMachine();
        Gun gun = player.getGunICarry();
        //System.out.println(gun.stats.sprint +" " + gun.stats.lowNumberOfEnemies + " " + gun.stats.highNumberOfEnemies + " " + gun.stats.shortDistanceEnemy);
        double min = 50.0, max = 60.0;
        System.out.println(machine.yourLuckyNumber(min, max) / 100);
        int ok = 0;
        if (type == 1) {
            System.out.println("You got ambush...");
            if (gun.stats.getSprint() > machine.yourLuckyNumber(min, max) / 100 && gun.stats.getLowNumberOfEnemies() > machine.yourLuckyNumber(min, max) / 100) {
                ok = 1;
            }
            if (ok == 1) {
                System.out.println("BUT YOU GOT OUT!");
                return 10;
            } else {
                System.out.println("YOUR PLAYER DIED!");
                return -20;
            }
        }
        if (type == 2) {
            System.out.println("Sonic Zombie had attacked your massive slow legs...");
            if (gun.stats.getHighNumberOfEnemies() > machine.yourLuckyNumber(min, max) / 100 && gun.stats.getShortDistanceEnemy() > machine.yourLuckyNumber(min, max) / 100) {
                ok = 1;
            }
            if (ok == 1) {
                System.out.println("BUT YOU GOT OUT!");
                return 10;
            } else {
                System.out.println("YOUR PLAYER DIED!");
                return -20;
            }
        }
        if (type == 3) {
            System.out.println("You got kidnapped buy some massive nerds and you had to play check with their boss...");
            if (gun.stats.getShortDistanceEnemy() > machine.yourLuckyNumber(min, max) / 100 && gun.stats.getLowNumberOfEnemies() > machine.yourLuckyNumber(min, max) / 100) {
                ok = 1;
            }
            if (ok == 1) {
                System.out.println("BUT YOU WON AND GOT OUT!");
                return 10;
            } else {
                System.out.println("YOUR PLAYER LOST ADN DIED!");
                return -20;
            }
        }
        return  0;
    }

    public static int getQuickAndSafe() {
        return quickAndSafe;
    }

    public static void setQuickAndSafe(int quickAndSafe) {
        Scenes.quickAndSafe = quickAndSafe;
    }

    public static int getAtackAndDestroy() {
        return atackAndDestroy;
    }

    public static void setAtackAndDestroy(int atackAndDestroy) {
        Scenes.atackAndDestroy = atackAndDestroy;
    }

    public static int getScoutAndSearch() {
        return scoutAndSearch;
    }

    public static void setScoutAndSearch(int scoutAndSearch) {
        Scenes.scoutAndSearch = scoutAndSearch;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}
