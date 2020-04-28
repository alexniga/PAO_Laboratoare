package proiectul1_etapa1.entities;

public class SlotMachine {
    private int yourNumber;
    private String[] names = new String[]{"Basic", "Normal", "Epic"};

    public int getYourNumber() {
        return yourNumber;
    }

    public void setYourNumber(int yourNumber) {
        this.yourNumber = yourNumber;
    }

    public int yourLuckyNumber(int min, int max){
        return (int) (Math.floor(Math.random() * (max - min)) + min);
    }

    public double yourLuckyNumber(double min, double max){
        return (Math.floor(Math.random() * (max - min)) + min);
    }

    public String getName(int i) {
        return names[i];
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }
}
