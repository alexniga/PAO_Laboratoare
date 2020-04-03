package proiectul1_etapa1;

public class Knife extends Melee {

    static int minSlash = 70, maxSlash = 100;
    static int minDig = 40, maxDig = 60;
    static int minChop = 35, maxChop = 55;


    public Knife(){
        type = 1;
    }

    @Override
    public void buyMelee(){
        SlotMachine machine = new SlotMachine();
        int myluck = machine.yourLuckyNumber(0,3);
        calculateMyRating(myluck);
        name = machine.getName(myluck) + " Knife";
        slash = machine.yourLuckyNumber(minSlash, maxSlash);
        dig = machine.yourLuckyNumber(minDig, maxDig);
        chop = machine.yourLuckyNumber(minChop, maxChop);
    }

    public static int getMinSlash() {
        return minSlash;
    }

    public static void setMinSlash(int minSlash) {
        Knife.minSlash = minSlash;
    }

    public static int getMaxSlash() {
        return maxSlash;
    }

    public static void setMaxSlash(int maxSlash) {
        Knife.maxSlash = maxSlash;
    }

    public static int getMinDig() {
        return minDig;
    }

    public static void setMinDig(int minDig) {
        Knife.minDig = minDig;
    }

    public static int getMaxDig() {
        return maxDig;
    }

    public static void setMaxDig(int maxDig) {
        Knife.maxDig = maxDig;
    }

    public static int getMinChop() {
        return minChop;
    }

    public static void setMinChop(int minChop) {
        Knife.minChop = minChop;
    }

    public static int getMaxChop() {
        return maxChop;
    }

    public static void setMaxChop(int maxChop) {
        Knife.maxChop = maxChop;
    }

    private void calculateMyRating(int myluck) {
        switch (myluck){
            case 0:
                rating = 6.0;
                break;
            case 1:
                rating = 8.0;
                abilites.add("Rapid Slash");
                break;
            case 2:
                rating = 10;
                abilites.add("Rapid Slash");
                abilites.add("Silent Execute");
                break;
        }
    }
}
