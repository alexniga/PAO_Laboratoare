package com.company;
import java.util.*;
import java.lang.*;


public class ex3 {
    public static int isPrim(int x)
    {
        if(x <= 1)
            return 1;

        int i = 2;

        for(i = 2; i <= Math.sqrt(x); i++)
        {
            if(x % i == 0)
                return 1;
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        int i = 0, j =0;
        for (i = 0; i < n; i++){
            for (j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] matrix2 = new int[n][m];
        for (i = 0; i < n; i++){
            for (j = 0; j < m; j++){
                int elem = isPrim(matrix[i][j]);
                matrix2[i][j] = elem;
            }
        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
