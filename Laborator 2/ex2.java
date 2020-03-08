package laborator2;
import java.util.*;

public class ex2{
    
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, vec1 = 0, vec2 = 0;
        int [] x = new int[vec1];
        int [] y = new int[vec2];
        
        for (int i = 1; i <= n; i++){
            int nr = sc.nextInt();
            if (nr % 2 == 0)
                {vec1++;
                 x = new int[vec1];
                 x[vec1 - 1] = nr;
                }
            else
                {
                vec2++;
                y = new int[vec2];
                y[vec2 - 1] = nr;
                }
        }
        
        if (x.length > y.length)
            System.out.println("x - pare > y - impare");
        else if (x.length < y.length)
            System.out.println("y - impare > x - pare");
        else
            System.out.println("y - impare == x - pare");
    }
}