package sample;

public class Exercitiul1 {

    public static void main(String[] args){
        RandomTask mes = new RandomTask("Acesta este un mesaj");
        mes.execute();
        RandomOutTsk rand = new RandomOutTsk();
        rand.execute();
        CounterOutTask cnt1 = new CounterOutTask();
        CounterOutTask cnt2 = new CounterOutTask();
        cnt1.execute();
        cnt2.execute();

    }
}
