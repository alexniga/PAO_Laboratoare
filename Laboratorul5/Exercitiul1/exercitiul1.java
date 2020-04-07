package tema6;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;


public class exercitiul1 {

    public static void main(String[] args) throws FirstIsBiggerThenSecond {

        int count = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti va rog 4 perechi de numere care respecta conditia!");

        try {

            FileWriter output = new FileWriter("outputEx1.txt");

            while (count != 0) {
                try{
                    count--;
                    int x1 = sc.nextInt();
                    int x2 = sc.nextInt();

                    if (x1 >= x2) {
                        count++;
                        throw new FirstIsBiggerThenSecond("Introduceti alte valori ce respecta ca primul sa fie mai mic decat al doilea!");
                    }
                    output.write("[");
                    output.write(String.valueOf(x1));
                    output.write(" , ");
                    output.write(String.valueOf(x2));
                    output.write("]");
                    output.write("\n");
                }
                catch (FirstIsBiggerThenSecond e) {
                    System.out.println("Introduceti alte 2 valori:");
                }
            }
            output.close();
        } catch (IOException e) {
            System.out.println("Fisierul nu a fost gasit");
        }

    }
}
