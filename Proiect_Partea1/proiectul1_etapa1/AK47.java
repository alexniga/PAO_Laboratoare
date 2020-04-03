package proiectul1_etapa1;

public class AK47 extends Gun{


    public AK47(){
        super();
        this.type = 2;
    }

    public AK47(String name, String ammoType, int ammoCapacity, int power, int reloadSpeed, int weight, double rating, int scope) {
        super(name, ammoType, ammoCapacity, power, reloadSpeed, weight, rating, scope);
        this.type = 2;
    }

    @Override
    public void buyMyGun(){
        SlotMachine yourLuck = new SlotMachine();
        int myLuck = yourLuck.yourLuckyNumber(0,3);
        this.name = yourLuck.getName(myLuck) + " AK47";
        myLuck *= 3;
        this.ammoType = "7mm";
        this.ammoCapacity = yourLuck.yourLuckyNumber(25,37) + myLuck;
        this.power = yourLuck.yourLuckyNumber(40, 50) + myLuck;
        this.reloadSpeed = yourLuck.yourLuckyNumber(30,40) + myLuck;
        this.weight = yourLuck.yourLuckyNumber(10, 15) - myLuck;
        this.scope = 2 * yourLuck.yourLuckyNumber(0, 4);
    }

}
