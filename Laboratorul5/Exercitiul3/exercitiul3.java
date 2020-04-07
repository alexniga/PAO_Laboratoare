package tema6;

import java.io.FileInputStream;

public class exercitiul3 {

    /// AM PRESUPUS CA NUMELE COMPLET AL UNEI PERSOANE ESTE FORMAT DOAR DIN 2 CUVINTE
    /// DACA AS FI STIUT CA ESTE FORMAT SI DIN 3 CUVINTE(2 PRENUME) VOI MODIFICA LA linia 24 ianinte de a face ok++; si continue; as verifica daca urmatoare este litera si nu numar

    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("clienti.txt");
            int i = 0;
            String[] firstName = new String[9999];
            String[] lastName = new String[9999];
            String[] varstaString = new String[9999];
            firstName[0] = new String("");
            lastName[0] = new String("");
            varstaString[0] = new String("");
            int count = 0, ok = 1;
            while ((i = fin.read()) != -1) {
                if ((char) i == ' ') {
                    ok++;
                    continue;
                }

                if ((char) i == '\n') {
                    ok = 4;
                    firstName[count + 1] = new String("");
                    lastName[count + 1] = new String("");
                    varstaString[count + 1] = new String("");
                }

                if (ok == 4) {
                    ok = 1;
                    count++;
                    continue;
                }
                if (ok == 1)
                    firstName[count] += (char) i;
                if (ok == 2)
                    lastName[count] += (char) i;
                if (ok == 3) {
                    if (Character.isDigit((char) i))
                        varstaString[count] += (char)i;
                }
            }
            fin.close();
            int nrMajori = 0, nrMinori = 0;
            for (i = 0; i <= count; i++){
                int varsta = Integer.parseInt(varstaString[i]);
                if (varsta >= 18){
                    nrMajori++;
                    System.out.println(firstName[i] + " " + lastName[i] + " " + varstaString[i]);
                }
                else nrMinori++;
            }
            System.out.print("\nAvem " + nrMajori + " majori in fisier, dupa cum observam si in lista de mai sus!\n\nAvem " + nrMinori +" minori in fisier!\n\nLista de oameni este:\n\n");
            for (i = 0; i <= count; i++){
                    System.out.println(firstName[i] + " " + lastName[i] + " " + varstaString[i]);
                }

        }catch(Exception e){System.out.println(e);}
    }
}
