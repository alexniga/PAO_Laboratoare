package proiectul1_etapa1;

public class Scenes {

    static int quickAndSafe = 1;
    static int atackAndDestroy = 2;
    static int scoutAndSearch = 3;
    int type;
    String situation;

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
        Gun gun = player.gunICarry;
        //System.out.println(gun.stats.sprint +" " + gun.stats.lowNumberOfEnemies + " " + gun.stats.highNumberOfEnemies + " " + gun.stats.shortDistanceEnemy);
        double min = 50.0, max = 60.0;
        System.out.println(machine.yourLuckyNumber(min, max) / 100);
        int ok = 0;
        if (type == 1) {
            System.out.println("You got ambush...");
            if (gun.stats.sprint > machine.yourLuckyNumber(min, max) / 100 && gun.stats.lowNumberOfEnemies > machine.yourLuckyNumber(min, max) / 100) {
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
            if (gun.stats.highNumberOfEnemies > machine.yourLuckyNumber(min, max) / 100 && gun.stats.shortDistanceEnemy > machine.yourLuckyNumber(min, max) / 100) {
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
            if (gun.stats.shortDistanceEnemy > machine.yourLuckyNumber(min, max) / 100 && gun.stats.lowNumberOfEnemies > machine.yourLuckyNumber(min, max) / 100) {
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
}
