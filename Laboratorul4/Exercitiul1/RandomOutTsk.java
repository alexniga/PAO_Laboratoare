package sample;
import  java.lang.Math;

public class RandomOutTsk implements Task {

    int rand;

    @Override
    public void execute() {
        System.out.println(rand);
    }

    public RandomOutTsk() {
        rand = (int)(Math.random() * 1000) + 1;
    }
}
