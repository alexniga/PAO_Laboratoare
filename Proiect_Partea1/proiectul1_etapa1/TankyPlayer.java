package proiectul1_etapa1;

public class TankyPlayer extends Player {

    static double bonusAgainstHighNumbersOfEnemies = 0.15;
    static double minusForSprint = -0.1;
    static int bonusHP = 25;
    String ability;
    int type = 2;

    private String[] abilitiesICanGet = new String[]{"Surprise Attack Resist", "Trap Resist", "Fighter"};

    public TankyPlayer(){
        for (Gun gun : this.gunsICarry){
            gun.stats.highNumberOfEnemies += bonusAgainstHighNumbersOfEnemies;
            gun.stats.sprint += minusForSprint;
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
