package proiectul1_etapa1.entities;

public class TankyPlayer extends Player {

    private static double bonusAgainstHighNumbersOfEnemies = 0.15;
    private static double minusForSprint = -0.1;
    private static int bonusHP = 25;
    private String ability;
    private int type = 2;

    private String[] abilitiesICanGet = new String[]{"Surprise Attack Resist", "Trap Resist", "Fighter"};

    public TankyPlayer(){
        for (Gun gun : this.getGunsICarry()){
            gun.stats.setHighNumberOfEnemies(gun.stats.getHighNumberOfEnemies() + bonusAgainstHighNumbersOfEnemies);
            gun.stats.setSprint(gun.stats.getSprint() + minusForSprint);
        }

        SlotMachine machine = new SlotMachine();
        ability = abilitiesICanGet[machine.yourLuckyNumber(0,3)];
    }

    public void changeMyAbility(){
        SlotMachine machine = new SlotMachine();
        ability = abilitiesICanGet[machine.yourLuckyNumber(0,3)];
    }

    @Override
    public void updateMyPlayerTypeAbilities(){
        this.getAbilites().add(ability);
    }

    public static double getBonusAgainstHighNumbersOfEnemies() {
        return bonusAgainstHighNumbersOfEnemies;
    }

    public static void setBonusAgainstHighNumbersOfEnemies(double bonusAgainstHighNumbersOfEnemies) {
        TankyPlayer.bonusAgainstHighNumbersOfEnemies = bonusAgainstHighNumbersOfEnemies;
    }

    public static double getMinusForSprint() {
        return minusForSprint;
    }

    public static void setMinusForSprint(double minusForSprint) {
        TankyPlayer.minusForSprint = minusForSprint;
    }

    public static int getBonusHP() {
        return bonusHP;
    }

    public static void setBonusHP(int bonusHP) {
        TankyPlayer.bonusHP = bonusHP;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String[] getAbilitiesICanGet() {
        return abilitiesICanGet;
    }

    public void setAbilitiesICanGet(String[] abilitiesICanGet) {
        this.abilitiesICanGet = abilitiesICanGet;
    }
}
