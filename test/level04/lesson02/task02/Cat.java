package com.javarush.test.level04.lesson02.task02;

/* Реализовать метод addNewCat
Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота), количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(reader.readLine());
        int b = Integer.valueOf(reader.readLine());
        if (a <  b)
            System.out.println(" минимум " + a);

        else
            System.out.println(" минимум "+ b) ;
    }
}
