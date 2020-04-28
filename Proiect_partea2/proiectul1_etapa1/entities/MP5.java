package proiectul1_etapa1.entities;

public class MP5 extends Gun {

    public  MP5(){
        super();
        this.setType(1);
    }

    public MP5(String name, String ammoType, int ammoCapacity, int power, int reloadSpeed, int weight, double rating, int scope) {
        super(name, ammoType, ammoCapacity, power, reloadSpeed, weight, rating, scope);
        this.setType(1);
    }

    @Override
    public void buyMyGun(){
        SlotMachine yourLuck = new SlotMachine();
        int myLuck = yourLuck.yourLuckyNumber(0,3);
        this.setName(yourLuck.getName(myLuck) + " MP5");
        myLuck *= 3;
        this.setAmmoType("4mm");
        this.setAmmoCapacity(yourLuck.yourLuckyNumber(46,60) + myLuck);
        this.setPower(yourLuck.yourLuckyNumber(25, 30) + myLuck);
        this.setReloadSpeed(yourLuck.yourLuckyNumber(53,60) + myLuck);
        this.setWeight(yourLuck.yourLuckyNumber(7, 14) - myLuck);
        this.setScope(2 * yourLuck.yourLuckyNumber(0, 3));
    }
}
