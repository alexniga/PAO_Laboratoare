package proiectul1_etapa1.entities;

import java.util.ArrayList;
import java.util.Collections;

public class MyMeleeHistory {

    ArrayList<Melee> meleesHistory;

    public MyMeleeHistory(){
        meleesHistory = new ArrayList<>();
    }
    public MyMeleeHistory(ArrayList<Melee> melees){
        this.meleesHistory = melees;
    }
    public void showWhatMeleesIHad(){
        Collections.sort(meleesHistory);

        for(Melee melee : meleesHistory){
            melee.showMyStats();
        }
    }

    public ArrayList<Melee> getMeleesHistory() {
        return meleesHistory;
    }

    public void setMeleesHistory(ArrayList<Melee> meleesHistory) {
        this.meleesHistory = meleesHistory;
    }
}
