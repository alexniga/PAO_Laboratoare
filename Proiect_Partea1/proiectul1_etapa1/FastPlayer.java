package proiectul1_etapa1;

public class FastPlayer extends Player {

    static double bonusSprint = 0.2;
    static double bonusLowNumberOfEnemies = 0.1;
    static double minusHighDistanceEnemies= -0.1;
    static int bonusHP = 10;
    String ability;
    int type = 1;
    private String[] abilitiesICanGet = new String[]{"Silent Execute", "Sneaky", "Fighter"};

    public FastPlayer(){
        for (Gun gun : this.gunsICarry){
            gun.stats.sprint += bonusSprint;
            gun.stats.lowNumberOfEnemies += bonusLowNumberOfEnemies;
            gun.stats.highDistanceEnemy += minusHighDistanceEnemies;
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
