package proiectul1_etapa1.entities;

public class AK47 extends Gun {


    public AK47(){
        super();
        this.setType(2);;
    }

    public AK47(String name, String ammoType, int ammoCapacity, int power, int reloadSpeed, int weight, double rating, int scope) {
        super(name, ammoType, ammoCapacity, power, reloadSpeed, weight, rating, scope);
        this.setType(2);
    }

    @Override
    public void buyMyGun(){
        SlotMachine yourLuck = new SlotMachine();
        int myLuck = yourLuck.yourLuckyNumber(0,3);
        this.setName(yourLuck.getName(myLuck) + " AK47");
        myLuck *= 3;
        this.setAmmoType("7mm");
        this.setAmmoCapacity(yourLuck.yourLuckyNumber(25,37) + myLuck);
        this.setPower(yourLuck.yourLuckyNumber(40, 50) + myLuck);
        this.setReloadSpeed(yourLuck.yourLuckyNumber(30,40) + myLuck);
        this.setWeight(yourLuck.yourLuckyNumber(10, 15) - myLuck);
        this.setScope(2 * yourLuck.yourLuckyNumber(0, 4));
    }

}
