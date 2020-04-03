package proiectul1_etapa1;

public class SkilledPlayer extends Player {

    static double bonusHighDistanceEnemies = 0.1;
    static double bonusLowNumberOfEnemies = 0.1;
    static double bonusShortDistanceEnemies = 0.1;
    static double minusHighNumberOfEnemies = -0.1;
    static double minusSprint = -0.1;
    String ability;
    int type = 3;
    private String[] abilitiesICanGet = new String[]{"Disarm Trap", "Sneaky", "Negotiate"};

    public SkilledPlayer(){
        for (Gun gun : this.gunsICarry){
            gun.stats.sprint += minusSprint;
            gun.stats.lowNumberOfEnemies += bonusLowNumberOfEnemies;
            gun.stats.highDistanceEnemy += bonusHighDistanceEnemies;
            gun.stats.shortDistanceEnemy += bonusShortDistanceEnemies;
            gun.stats.highNumberOfEnemies += minusHighNumberOfEnemies;
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
        this.abilites.add(ability);
    }
}
