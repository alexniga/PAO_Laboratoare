package sample;

public class RandomTask implements Task {

    String mesaj;

    @Override
    public void execute() {
        System.out.println(this.mesaj);
    }

    public  RandomTask(String s) {
        this.mesaj = s;
    }
}
