package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        int n1, n2, n3;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ( a > b && a > c ) {
            n3 = a;
            if (b > c) {
                n2 = b;
                n1 = c;
            } else {
                n2 = c;
                n1 = b;
            }
        }
        else {
            if (b > c) {
                n3 = b;
                if (a > c) {
                    n2 = a;
                    n1 = c;
                } else {
                    n2 = c;
                    n1 = a;
                }
            }
            else{
                n3 = c;
                if (a > b) {
                    n2 = a;
                    n1 = b;
                }
                else{
                    n2 = b;
                    n1 = a;
                }
            }
        }
        System.out.println( n3+" "+ n2+" "+n1);
    }
}
