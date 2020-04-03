package proiectul1_etapa1;

public class main {

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();

        for (int i = 1; i <= 4; i++){
            game.showTheSceneAndStats();
        }
        if (game.HP > 0)
            System.out.println("FELICITARI AI REUSIT SA CASTIGI!");
        else
            System.out.println("AI PIERDUT TURA ACEASTA :(");

        System.out.println("\n\nIndiferent daca ai castigat sau pierdut, uite aici ce colectie de arme frumoase ai avut!\n\n");
        game.historyOfWeapons.showWhatWeaponsIHad();
    }
}
