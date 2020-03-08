package laborator2;

public class Absolvent{
    private String Name;
    private double medieAbsolvita;
    
    public double getMedie(){
        return medieAbsolvita;
    }
    
    public String getName(){
        return Name;
    }
    
    public void setNume(String localName){
         this.Name = localName;
    }
    
    public void setMedie(double localMedie){
         this.medieAbsolvita = localMedie;
    }
    
    public void showData(){
        System.out.println(this.Name);
        System.out.println(this.medieAbsolvita);
    }
    
    public static void main( String [] args){
        Absolvent unAbsolvent = new Absolvent();
        unAbsolvent.setNume("Niga Alexandru");
        unAbsolvent.setMedie(9.18);
        unAbsolvent.showData();
    }
}
