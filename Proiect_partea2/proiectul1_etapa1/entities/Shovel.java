package proiectul1_etapa1.entities;

public class Shovel extends Melee {

    private static int minSlash = 70, maxSlash = 100;
    private static int minDig = 70, maxDig = 100;
    private static int minChop = 10, maxChop = 35;


    public Shovel(){
        type = 2;
    }

    @Override
    public void buyMelee(){
        SlotMachine machine = new SlotMachine();
        int myluck = machine.yourLuckyNumber(0,3);
        calculateMyRating(myluck);
        name = machine.getName(myluck) + " Shovel";
        slash = machine.yourLuckyNumber(minSlash, maxSlash);
        dig = machine.yourLuckyNumber(minDig, maxDig);
        chop = machine.yourLuckyNumber(minChop, maxChop);
    }

    public static int getMinSlash() {
        return minSlash;
    }

    public static void setMinSlash(int minSlash) {
        Shovel.minSlash = minSlash;
    }

    public static int getMaxSlash() {
        return maxSlash;
    }

    public static void setMaxSlash(int maxSlash) {
        Shovel.maxSlash = maxSlash;
    }

    public static int getMinDig() {
        return minDig;
    }

    public static void setMinDig(int minDig) {
        Shovel.minDig = minDig;
    }

    public static int getMaxDig() {
        return maxDig;
    }

    public static void setMaxDig(int maxDig) {
        Shovel.maxDig = maxDig;
    }

    public static int getMinChop() {
        return minChop;
    }

    public static void setMinChop(int minChop) {
        Shovel.minChop = minChop;
    }

    public static int getMaxChop() {
        return maxChop;
    }

    public static void setMaxChop(int maxChop) {
        Shovel.maxChop = maxChop;
    }

    private void calculateMyRating(int myluck) {
        switch (myluck){
            case 0:
                rating = 6.0;
                break;
            case 1:
                rating = 8.0;
                abilites.add("Hide");
                break;
            case 2:
                rating = 10;
                abilites.add("Hide");
                abilites.add("Rapid Slash");
                break;
        }
    }
}
