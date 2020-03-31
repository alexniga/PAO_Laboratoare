package sample;

public class Album implements Comparable<Album>{

    String nume;
    int anulPublicarii;
    double rating;


    public Album (String name, int an, double rate) {
        this.nume = name;
        this.anulPublicarii = an;
        this.rating = rate;
    }

    public void setNume(String name){
        this.nume = name;
    }

    public String getNume(){
        return this.nume;
    }

    public void setAnulPublicarii(int an){
        this.anulPublicarii = an;
    }

    public int getAnulPublicarii(){
        return this.anulPublicarii;
    }

    public void setRating(double rate){
        this.rating = rate;
    }

    public double getRating(){
        return this.rating;
    }

    @Override
    public int compareTo(Album album) {
        if (this.nume.equals(album.nume)){
            if (this.rating == album.rating) {
                    return 0;
                }
            else if (this.rating > album.rating){
                    return -1;
            }
            else
                return 1;
            }
        else if (this.nume.compareTo(album.nume) > 0){
            return 1;
        }
        else
            return -1;

        }

    }

