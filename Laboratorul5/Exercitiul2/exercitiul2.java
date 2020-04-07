package tema6;
import java.io.*;
import java.io.FileInputStream;
import java.util.Scanner;

public class exercitiul2 {

    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("parole.txt");
            int i=0;
            String[] users = new String[9999];
            String[] passwords = new String[9999];
            users[0] = new String("");
            passwords[0] = new String("");

            int count = 0, ok = 1;
            while((i=fin.read())!=-1){
                if ((char) i == ' '){
                    ok = 2;
                    continue;
                }

                if ((char)i == '\n'){
                    ok = 3;
                    users[count + 1] = new String("");
                    passwords[count + 1] = new String("");
                }

                if (ok == 3){
                    ok = 1;
                    count++;
                    continue;
                }
                if (ok == 1)
                    users[count] += (char)i;
                if (ok == 2) {
                   if (Character.isLetter((char)i))
                        passwords[count] += (char) i;
                }
            }
            fin.close();

            System.out.println("\n");
            int ok1 = 0, nrTrys = 0;
            while (ok1 == 0) {
                nrTrys++;
                System.out.println("Va rog sa introduceti datele dumneavoastra!");
                Scanner sc = new Scanner(System.in);
                System.out.print("\nUser: ");
                String usr = sc.nextLine();
                System.out.print("\nPassword: ");
                String prl = sc.nextLine();

                for (i = 0; i <= count; i++) {
                    if (ok1 == 1)
                        break;
                    if (users[i].equals(usr)) {
                        if (passwords[i].equals(prl)) {
                            System.out.println("Acces permis!");
                            ok1= 1;
                            break;
                        } else {
                            int j = 1;
                            for (j = 1; j <= 3; j++) {
                                System.out.print("Parola gresita!");
                                System.out.print("\nPassword: ");
                                String newTry = sc.nextLine();
                                if (passwords[i].equals(newTry)) {
                                    System.out.println("Acces permis!");
                                    ok1 = 1;
                                    break;
                                }
                            }
                            if (j == 4) {
                                System.out.println("Cont blocat!");
                                ok1 = 1;
                            }
                        }
                    }
                }
                if (nrTrys == 5){
                    ok1 = 1;
                    System.out.println("Nu ai cont, mergi si inregistreaza-te undeva!");
                }
            }


        }catch(Exception e){System.out.println(e);}
    }
}

