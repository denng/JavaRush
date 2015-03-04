package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String a = "S";
        int b = 0, c = 0;
        while (b < 10)
        {
            while (c < 10)
            {
                System.out.print(a);
                c++;
            }
            System.out.println("");
            b++;
            c = 0;
        }
    }
}
