package proiectul1_etapa1.entities;

public class AWP extends Gun {


    public AWP(){
        super();
        this.setType(3);
    }
    public AWP(String name, String ammoType, int ammoCapacity, int power, int reloadSpeed, int weight, double rating, int scope){
        super(name, ammoType, ammoCapacity, power, reloadSpeed, weight, rating, scope);
        this.setType(3);
    }

    @Override
    public void buyMyGun(){
        SlotMachine yourLuck = new SlotMachine();
        int myLuck = yourLuck.yourLuckyNumber(0,3);
        this.setName(yourLuck.getName(myLuck) + " AWP");
        myLuck *= 3;
        this.setAmmoType("12mm");
        this.setAmmoCapacity(yourLuck.yourLuckyNumber(5,11) + myLuck);
        this.setPower(yourLuck.yourLuckyNumber(60,71) + myLuck);
        this.setReloadSpeed(yourLuck.yourLuckyNumber(10,16) + myLuck);
        this.setWeight(yourLuck.yourLuckyNumber(15, 21) - myLuck);
        this.setScope(2 * yourLuck.yourLuckyNumber(2, 5));
    }

}
