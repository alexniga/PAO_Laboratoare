package com.company;
import java.util.*;
import java.lang.*;

public class ex2 {

    public static boolean isPalindrom(String st){
        StringBuilder st2 = new StringBuilder();
        st2.append(st);
        st2 = st2.reverse();
        return st.contentEquals(st2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); sc.nextLine();
        String[] a = new String[n];
        String[] b = new String[n];
        String maxPal = new String("");
        int i = 0, nr = -1;
        for (i = 0; i < n; i++){
            String st = sc.nextLine();
            a[i] = st;
            if (isPalindrom(st)){
                nr++;
                b[nr] = st;
                if (st.length() > maxPal.length()){
                    maxPal = st;
                }
            }
        }
        if (maxPal.length() != 0)
            System.out.println(maxPal);
        else
            System.out.println("Mai/bai! Nu sunt palindroame in vector");
    }
}
