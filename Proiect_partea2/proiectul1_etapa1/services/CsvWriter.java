package proiectul1_etapa1.services;
import proiectul1_etapa1.entities.Game;
import proiectul1_etapa1.entities.Gun;
import proiectul1_etapa1.entities.Melee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CsvWriter {

    private static CsvWriter instance;

    private CsvWriter(){}

    public static CsvWriter getInstance(){
        if(instance == null){
            instance = new CsvWriter();
        }
        return instance;
    }

    public void writeNewInfos(Game game){
        this.writeGunDetails(game);
        this.writeGunStats(game);
        this.writeMelee(game);
        System.out.println("\n\nYour weapons history had been updated!\n\n");
    }

    public void writeGunDetails(Game game) {

        try (PrintWriter writer = new PrintWriter(new File("/Users/Niga/IdeaProjects/PROIECT_PARTEA1/src/proiectul1_etapa1/GunsHistoryDetails.csv"))) {
            for (Gun gun : game.getHistoryOfWeapons().getWeaponsHistory()){
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(gun.getName()));
                sb.append(',');
                sb.append(String.valueOf(gun.getRating()));
                sb.append(',');
                sb.append(String.valueOf(gun.getAmmoType()));
                sb.append(',');
                sb.append(String.valueOf(gun.getAmmoCapacity()));
                sb.append(',');
                sb.append(String.valueOf(gun.getPower()));
                sb.append(',');
                sb.append(String.valueOf(gun.getReloadSpeed()));
                sb.append(',');
                sb.append(String.valueOf(gun.getWeight()));
                sb.append(',');
                sb.append(String.valueOf(gun.getScope()));
                sb.append('\n');
                writer.write(sb.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public void writeGunStats(Game game) {
        try (PrintWriter writer = new PrintWriter(new File("/Users/Niga/IdeaProjects/PROIECT_PARTEA1/src/proiectul1_etapa1/GunsHistoryStats.csv"))) {
            for (Gun gun : game.getHistoryOfWeapons().getWeaponsHistory()){
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(gun.getStats().getHighDistanceEnemy()));
                sb.append(',');
                sb.append(String.valueOf(gun.getStats().getShortDistanceEnemy()));
                sb.append(',');
                sb.append(String.valueOf(gun.getStats().getHighNumberOfEnemies()));
                sb.append(',');
                sb.append(String.valueOf(gun.getStats().getLowNumberOfEnemies()));
                sb.append(',');
                sb.append(String.valueOf(gun.getStats().getSprint()));
                sb.append('\n');
                writer.write(sb.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public void writeMelee(Game game) {
        try (PrintWriter writer = new PrintWriter(new File("/Users/Niga/IdeaProjects/PROIECT_PARTEA1/src/proiectul1_etapa1/MeleeHistory.csv"))) {

            for (Melee melee : game.getHistoryOfMelees().getMeleesHistory()){
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(melee.getName()));
                sb.append(',');
                sb.append(String.valueOf(melee.getRating()));
                sb.append(',');
                sb.append(String.valueOf(melee.getSlash()));
                sb.append(',');
                sb.append(String.valueOf(melee.getDig()));
                sb.append(',');
                sb.append(String.valueOf(melee.getChop()));
                sb.append('\n');
                writer.write(sb.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
