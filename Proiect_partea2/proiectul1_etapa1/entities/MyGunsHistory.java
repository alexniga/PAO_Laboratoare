package proiectul1_etapa1.entities;

import java.util.ArrayList;
import java.util.Collections;

public class MyGunsHistory {

    ArrayList<Gun> weaponsHistory;

    public MyGunsHistory(){
        weaponsHistory = new ArrayList<>();
    }

    public  MyGunsHistory(ArrayList<Gun> list){
        this.weaponsHistory = list;
    }

    public void showWhatWeaponsIHad(){
        Collections.sort(weaponsHistory);

        for(Gun gun : weaponsHistory){
            gun.showMyGun();
            gun.showMyBattleStats();
        }
    }

    public ArrayList<Gun> getWeaponsHistory() {
        return weaponsHistory;
    }

    public void setWeaponsHistory(ArrayList<Gun> weaponsHistory) {
        this.weaponsHistory = weaponsHistory;
    }
}
