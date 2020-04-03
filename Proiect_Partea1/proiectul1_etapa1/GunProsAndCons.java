package proiectul1_etapa1;

public class GunProsAndCons {

    double highDistanceEnemy, shortDistanceEnemy;
    double highNumberOfEnemies, lowNumberOfEnemies;
    double sprint;

    public GunProsAndCons(double highDistanceEnemy, double shortDistanceEnemy, double highNumberOfEnemies, double lowNumberOfEnemies, double sprint){
        this.highDistanceEnemy = highDistanceEnemy;
        this.shortDistanceEnemy = shortDistanceEnemy;
        this.highNumberOfEnemies = highNumberOfEnemies;
        this.lowNumberOfEnemies = lowNumberOfEnemies;
        this.sprint = sprint;
    }

    public GunProsAndCons() {

    }

    public double getHighDistanceEnemy() {
        return highDistanceEnemy;
    }

    public void setHighDistanceEnemy(double highDistanceEnemy) {
        this.highDistanceEnemy = highDistanceEnemy;
    }

    public double getShortDistanceEnemy() {
        return shortDistanceEnemy;
    }

    public void setShortDistanceEnemy(double shortDistanceEnemy) {
        this.shortDistanceEnemy = shortDistanceEnemy;
    }

    public double getHighNumberOfEnemies() {
        return highNumberOfEnemies;
    }

    public void setHighNumberOfEnemies(double highNumberOfEnemies) {
        this.highNumberOfEnemies = highNumberOfEnemies;
    }

    public double getLowNumberOfEnemies() {
        return lowNumberOfEnemies;
    }

    public void setLowNumberOfEnemies(double lowNumberOfEnemies) {
        this.lowNumberOfEnemies = lowNumberOfEnemies;
    }

    public double getSprint() {
        return sprint;
    }

    public void setSprint(double sprint) {
        this.sprint = sprint;
    }

    public void calculateTheStats(int ammoCapacity, int power, int reloadSpeed, int weight, int scope){

        double sum = 0;
        sum = ammoCapacity + reloadSpeed;
        highNumberOfEnemies = sum / 100;
        sum = power + reloadSpeed;
        lowNumberOfEnemies = sum / 100;
        sum = scope * 10;
        highDistanceEnemy = sum / 100;
        sum = ammoCapacity + power - weight;
        shortDistanceEnemy =  sum / 100;
        sum = 100 - 5 *weight;
        sprint = sum / 100;
    }
}
