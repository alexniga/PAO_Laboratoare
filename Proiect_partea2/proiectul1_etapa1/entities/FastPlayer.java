package proiectul1_etapa1.entities;

import java.util.ArrayList;

public class FastPlayer extends Player {

    static double bonusSprint = 0.2;
    static double bonusLowNumberOfEnemies = 0.1;
    static double minusHighDistanceEnemies= -0.1;
    static int bonusHP = 10;
    String ability;
    int type = 1;
    private String[] abilitiesICanGet = new String[]{"Silent Execute", "Sneaky", "Fighter"};

    public FastPlayer(){
        for (Gun gun : this.getGunsICarry()){
            gun.stats.setSprint(gun.stats.getSprint() + bonusSprint);
            gun.stats.setLowNumberOfEnemies(gun.stats.getLowNumberOfEnemies() + bonusLowNumberOfEnemies);
            gun.stats.setHighDistanceEnemy(gun.stats.getHighDistanceEnemy() + minusHighDistanceEnemies);
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
