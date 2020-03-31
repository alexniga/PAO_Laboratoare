package sample;

public class CounterOutTask implements Task {

    public static int counter;

    @Override
    public void execute() {
        counter++;
        System.out.println(counter);
    }

    public CounterOutTask() {
        counter = 0;
    }
}
