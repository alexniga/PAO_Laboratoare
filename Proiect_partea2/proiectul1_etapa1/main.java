package proiectul1_etapa1;

import proiectul1_etapa1.entities.Game;
import proiectul1_etapa1.services.CSVReader;
import proiectul1_etapa1.services.CsvWriter;

import java.util.Scanner;

public class main {

    public static void main(String[] args) throws InterruptedException {

        Game game = new Game();
        CSVReader csvRead = CSVReader.getInstance();
        game.setHistoryOfWeapons(csvRead.readTheGuns());
        game.setHistoryOfMelees(csvRead.readTheMelee());
        for (int i = 1; i <= 4; i++){
            game.showTheSceneAndStats();
        }
        if (game.getHP() > 0)
            System.out.println("FELICITARI AI REUSIT SA CASTIGI!");
        else
            System.out.println("AI PIERDUT TURA ACEASTA :(");

        System.out.println("\n\nIndiferent daca ai castigat sau pierdut, uite aici ce colectie de arme frumoase ai avut pana acum!\n\n");
        game.showMyGunHistory();

        System.out.println("\n\nIndiferent daca ai castigat sau pierdut, uite aici ce colectie de cutie frumoase ai avut pana acum!\n\n");
        game.showMyMeleesHistory();

        CsvWriter writer = CsvWriter.getInstance();
        writer.writeNewInfos(game);

        Scanner scan = new Scanner(System.in);
        System.out.print("\nDO YOU WANT TO SEETHE PEOPLE THAT YOU PLAYED WITH?\n 1: yes\n 2: no\n Chose 1 or 2 please: ");
        int num = scan.nextInt();
        if (num == 1){
            game.showMyPlayers();
        }
    }
}
