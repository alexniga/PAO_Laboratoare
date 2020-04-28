package proiectul1_etapa1.entities;

import java.util.ArrayList;

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
        for (Gun gun : this.getGunsICarry()){
            gun.stats.setSprint(gun.stats.getSprint() + minusSprint);
            gun.stats.setLowNumberOfEnemies(gun.stats.getLowNumberOfEnemies() + bonusLowNumberOfEnemies);
            gun.stats.setHighDistanceEnemy(gun.stats.getHighDistanceEnemy() + bonusHighDistanceEnemies);
            gun.stats.setShortDistanceEnemy(gun.stats.getShortDistanceEnemy() + bonusShortDistanceEnemies);
            gun.stats.setHighNumberOfEnemies(gun.stats.getHighNumberOfEnemies() + minusHighNumberOfEnemies);
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
        ArrayList<String> localAbilites = new ArrayList<>();
        localAbilites = this.getAbilites();
        localAbilites.add(ability);
        this.setAbilites(localAbilites);
    }
}
