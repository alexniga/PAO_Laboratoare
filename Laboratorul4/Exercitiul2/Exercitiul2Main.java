package sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Exercitiul2Main {

    public static void main(String[] args){
        ArrayList<Album> lista = new ArrayList<>();
        lista.add(new Album("Marcel Cel", 2002, 9));
        lista.add(new Album("Marcel Cel", 2001, 8));
        lista.add(new Album("Marcel", 2000, 10));
        lista.add(new Album("Marcel", 2022, 8.6));

        for (Album album: lista){
            System.out.println(album.nume + "    " + album.anulPublicarii + "   " + album.rating);
        }
        Collections.sort(lista);
        System.out.println("");
        for (Album album: lista){
            System.out.println(album.nume + "    " + album.anulPublicarii + "   " + album.rating);
        }
    }
}
