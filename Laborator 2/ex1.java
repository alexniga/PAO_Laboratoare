package laborator2;
import java.util.*;

public class ex1{
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float sum = 0, i = 1, ok = 1;
        float medie = 0;
        for (i = 1; i <= n; i++){
            float nr = sc.nextInt();
            if (nr != -1)
                sum += nr;
            else
                {
                medie = sum / (i - 1);
                ok = 0;
                break;
                }
        }
        
        if (ok == 1)
            medie = sum / n;
        
        System.out.println(medie);
    }
}