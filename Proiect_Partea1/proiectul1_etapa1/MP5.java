package proiectul1_etapa1;

public class MP5 extends Gun {

    public  MP5(){
        super();
        this.type = 1;
    }

    public MP5(String name, String ammoType, int ammoCapacity, int power, int reloadSpeed, int weight, double rating, int scope) {
        super(name, ammoType, ammoCapacity, power, reloadSpeed, weight, rating, scope);
        this.type = 1;
    }

    @Override
    public void buyMyGun(){
        SlotMachine yourLuck = new SlotMachine();
        int myLuck = yourLuck.yourLuckyNumber(0,3);
        this.name = yourLuck.getName(myLuck) + " MP5";
        myLuck *= 3;
        this.ammoType = "4mm";
        this.ammoCapacity = yourLuck.yourLuckyNumber(46,60) + myLuck;
        this.power = yourLuck.yourLuckyNumber(25, 30) + myLuck;
        this.reloadSpeed = yourLuck.yourLuckyNumber(53,60) + myLuck;
        this.weight = yourLuck.yourLuckyNumber(7, 14) - myLuck;
        this.scope = 2 * yourLuck.yourLuckyNumber(0, 3);
    }
}
