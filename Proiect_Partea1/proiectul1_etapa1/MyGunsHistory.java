package proiectul1_etapa1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class MyGunsHistory {

    ArrayList<Gun> weaponsHistory;

    public MyGunsHistory(){
        weaponsHistory = new ArrayList<>();
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
