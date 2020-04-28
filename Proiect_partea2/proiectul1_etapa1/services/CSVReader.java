package proiectul1_etapa1.services;
import proiectul1_etapa1.entities.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {

    private static CSVReader instance;

    private CSVReader(){}

    public static CSVReader getInstance(){
        if(instance == null){
            instance = new CSVReader();
        }
        return instance;
    }

    private ArrayList<Gun> weapons_list = new ArrayList<>();
    private ArrayList<Melee> melees_list = new ArrayList<>();
    private ArrayList<GunProsAndCons> prosAndCons = new ArrayList<>();


    public MyGunsHistory readTheGuns(){
        this.readGunsDetails();
        this.readGunsStats();
        return new MyGunsHistory(this.getWeapons_list());
    }
    public MyMeleeHistory readTheMelee(){
        this.readMeleeStats();
        return new MyMeleeHistory(this.melees_list);
    }

    public void readGunsStats(){

        String csvFile = "/Users/Niga/IdeaProjects/PROIECT_PARTEA1/src/proiectul1_etapa1/GunsHistoryStats.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
            int i = -1;
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                i++;
                String[] gun = line.split(cvsSplitBy);
                double highDistanceEnemy = Double.parseDouble(gun[0]);
                double shortDistanceEnemy = Double.parseDouble(gun[1]);
                double highNumberOfEnemies = Double.parseDouble(gun[2]);
                double lowNumberOfEnemies = Double.parseDouble(gun[3]);
                double sprint = Double.parseDouble(gun[4]);
                this.weapons_list.get(i).setMyGunProsAndCons(highDistanceEnemy, shortDistanceEnemy, lowNumberOfEnemies, highNumberOfEnemies, sprint);
                //System.out.println("GUN [shortDistanceEnemy= " + shortDistanceEnemy + " , lowNumberOfEnemies=" + lowNumberOfEnemies + "]");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void readGunsDetails() {

        String csvFile = "/Users/Niga/IdeaProjects/PROIECT_PARTEA1/src/proiectul1_etapa1/GunsHistoryDetails.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        MyGunsHistory gunHis = new MyGunsHistory();

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] gun = line.split(cvsSplitBy);
                String gun_name = gun[0];
                double rating = Double.parseDouble(gun[1]);
                String ammoType = gun[2];
                int ammoCapacity =  Integer.parseInt(gun[3]);
                int power =  Integer.parseInt(gun[4]);
                int reloadSpeed =  Integer.parseInt(gun[5]);
                int weight =  Integer.parseInt(gun[6]);
                int scope = Integer.parseInt(gun[7]);
                System.out.println("GUN [shortDistanceEnemy= " + gun_name + " , lowNumberOfEnemies=" + rating + "]");
                Gun local_gun = new Gun(gun_name,ammoType,ammoCapacity,power,reloadSpeed,weight,rating,scope);
                gunHis.getWeaponsHistory().add(local_gun);
                this.weapons_list.add(local_gun);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        MyGunsHistory gunHiss = new MyGunsHistory(this.weapons_list);
       // gunHis.showWhatWeaponsIHad();
        gunHiss.showWhatWeaponsIHad();

    }

    public ArrayList<Gun> getWeapons_list() {
        return weapons_list;
    }

    public void setWeapons_list(ArrayList<Gun> weapons_list) {
        this.weapons_list = weapons_list;
    }

    public void readMeleeStats(){

        String csvFile = "/Users/Niga/IdeaProjects/PROIECT_PARTEA1/src/proiectul1_etapa1/MeleeHistory.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {
            int i = -1;
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                i++;
                String[] melee = line.split(cvsSplitBy);
                String meleeName = melee[0];
                double rating = Double.parseDouble(melee[1]);
                double slash = Double.parseDouble(melee[2]);
                double dig = Double.parseDouble(melee[3]);
                double chop = Double.parseDouble(melee[4]);
                Melee melee1 = new Melee(meleeName,rating,slash,dig,chop);
                melees_list.add(melee1);
                //System.out.println("GUN [shortDistanceEnemy= " + shortDistanceEnemy + " , lowNumberOfEnemies=" + lowNumberOfEnemies + "]");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
