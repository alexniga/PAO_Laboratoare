package proiectul1_etapa1.entities;

public class Gun implements Comparable<Gun>{

    private String name, ammoType;
    //   [10, 60]    [20, 70]  [10, 60]   [5, 20]
    private int ammoCapacity, power, reloadSpeed, weight;
    private double rating;
    private  int scope; // 0x 2x, 4x, 6x, 8x;
    GunProsAndCons stats = new GunProsAndCons();
    private int type = 0;
    public Gun(){}

    public Gun(String name, String ammoType, int ammoCapacity, int power, int reloadSpeed, int weight, double rating, int scope){

        this.name = name;
        this.ammoType = ammoType;
        this.ammoCapacity = ammoCapacity;
        this.power = power;
        this.reloadSpeed = reloadSpeed;
        this.weight = weight;
        this.rating = rating;
        this.scope = scope;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmmoType() {
        return ammoType;
    }

    public void setAmmoType(String ammoType) {
        this.ammoType = ammoType;
    }

    public int getAmmoCapacity() {
        return ammoCapacity;
    }

    public void setAmmoCapacity(int ammoCapacity) {
        this.ammoCapacity = ammoCapacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getScope() {
        return scope;
    }

    public void setScope(int scope) {
        this.scope = scope;
    }

    public int getReloadSpeed() {
        return reloadSpeed;
    }

    public void setReloadSpeed(int reloadSpeed) {
        this.reloadSpeed = reloadSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getRating() {
        return rating;
    }

    public GunProsAndCons getStats() {
        return stats;
    }

    public void setStats(GunProsAndCons stats) {
        this.stats = stats;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    public void buyMyGun(){}

    public void calculateMyRating(){
        if (stats.getHighDistanceEnemy() >= 0.5)
            rating += 2;
        else rating += stats.getHighDistanceEnemy();

        if (stats.getShortDistanceEnemy() >= 0.5)
            rating += 2;
        else rating += stats.getShortDistanceEnemy();

        if (stats.getLowNumberOfEnemies() >= 0.5)
            rating += 2;
        else rating += stats.getLowNumberOfEnemies();

        if (stats.getHighNumberOfEnemies() >= 0.5)
            rating += 2;
        else rating += stats.getHighNumberOfEnemies();

        if (stats.getSprint() >= 0.5)
            rating += 2;
        else rating += stats.getSprint();
    }

    public void setMyGunProsAndCons(double hiDisEne, double shrtDisEne, double lowNumbEne, double highNumbEne, double sprint){
        this.stats.setHighDistanceEnemy(hiDisEne);
        this.stats.setShortDistanceEnemy(shrtDisEne);
        this.stats.setLowNumberOfEnemies(lowNumbEne);
        this.stats.setHighNumberOfEnemies(highNumbEne);
        this.stats.setSprint(sprint);
    }

    public void showMyGun(){
        System.out.println("\n" + this.name + "  RATING: " + this.rating);
        System.out.print(" Ammo type: " + this.ammoType + " Ammo Capacity: " + this.ammoCapacity + " Power: " + this.power + " Reload Speed: " + this.reloadSpeed + " Weight: " + this.weight + " Scope: " + this.scope + "x\n");
    }

    public void showMyBattleStats(){
        System.out.println("highDistanceEnemy: " + this.stats.getHighDistanceEnemy()+ " shortDistanceEnemy: " + this.stats.getShortDistanceEnemy() + " highNumberOfEnemies: " + this.stats.getHighNumberOfEnemies() + " lowNumberOfEnemies: " + this.stats.getLowNumberOfEnemies() + " sprint: " + this.stats.getSprint());
    }

    public void calculateMyBattleChances(){
        this.stats.calculateTheStats(this.ammoCapacity, this.power, this.reloadSpeed, this.weight, this.scope);
        this.calculateMyRating();
    }


    @Override
    public int compareTo(Gun gun) {
        if (gun.rating == this.rating)
            return 0;
        else if (gun.rating > this.rating)
            return 1;
        else return -1;
    }
}
