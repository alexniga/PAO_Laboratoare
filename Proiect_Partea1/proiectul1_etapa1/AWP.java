package proiectul1_etapa1;
import  java.lang.Math;

public class AWP extends Gun {


    public AWP(){
        super();
        this.type = 3;
    }
    public AWP(String name, String ammoType, int ammoCapacity, int power, int reloadSpeed, int weight, double rating, int scope){
        super(name, ammoType, ammoCapacity, power, reloadSpeed, weight, rating, scope);
        this.type = 3;
    }

    @Override
    public void buyMyGun(){
        SlotMachine yourLuck = new SlotMachine();
        int myLuck = yourLuck.yourLuckyNumber(0,3);
        this.name = yourLuck.getName(myLuck) + " AWP";
        myLuck *= 3;
        this.ammoType = "12mm";
        this.ammoCapacity = yourLuck.yourLuckyNumber(5,11) + myLuck;
        this.power = yourLuck.yourLuckyNumber(60,71) + myLuck;
        this.reloadSpeed = yourLuck.yourLuckyNumber(10,16) + myLuck;
        this.weight = yourLuck.yourLuckyNumber(15, 21) - myLuck;
        this.scope = 2 * yourLuck.yourLuckyNumber(2, 5);
    }

}
