package com.company;
import java.lang.reflect.Array;
import java.util.*;

public class ex1 {

    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        s1 = new String(ch1);
        s2 = new String(ch2);

        //System.out.println(s1);
        //System.out.println(s2);
        if (s1.equals(s2))
            System.out.println("Stringurile sunt anagrame");
        else
            System.out.println("Stringurile nu sunt anagrame");

    }
}
