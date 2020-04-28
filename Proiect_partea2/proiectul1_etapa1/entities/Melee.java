package proiectul1_etapa1.entities;

import java.util.ArrayList;

public class Melee implements Comparable<Melee>{
    String name;
    int type = 0;
    double slash, dig, chop;
    double rating;
    ArrayList<String> abilites = new ArrayList<>();

    public Melee(){}
    public Melee(String name, double rating, double slash, double dig, double chop){
        this.name = name;
        this.rating = rating;
        this.slash = slash;
        this.dig = dig;
        this.chop = chop;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ArrayList<String> getAbilites() {
        return abilites;
    }

    public void setAbilites(ArrayList<String> abilites) {
        this.abilites = abilites;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getDig() {
        return dig;
    }

    public void setDig(double dig) {
        this.dig = dig;
    }

    public double getSlash() {
        return slash;
    }

    public void setSlash(double slash) {
        this.slash = slash;
    }

    public double getChop() {
        return chop;
    }

    public void setChop(double chop) {
        this.chop = chop;
    }

    public void buyMelee(){
        dig = 0;
        slash = 0;
        chop = 0;
    }

    public void showMyStats(){
        System.out.println("\n" + name + "  RATING: " + rating);
        System.out.println("Slash: " + slash + " Dig: " + dig + " Chop: " + chop);
    }

    @Override
    public int compareTo(Melee melee) {
        if (melee.rating == this.rating)
            return 0;
        else if (melee.rating > this.rating)
            return 1;
        else return -1;
    }
}
