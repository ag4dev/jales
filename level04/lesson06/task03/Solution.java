package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3)
        {
            System.out.print(num1+ " ");
            if (num2 > num3)
              System.out.print(num2 + " " +num3);
            else
                System.out.print(num3 + " " + num2);
        }

        if (num2 > num1 && num2 > num3)
        {
            System.out.print(num2+ " ");
            if (num1 > num3)
                System.out.print(num1 + " " + num3);
            else
                System.out.print(num3 + " " + num1);
        }

        if (num3 > num1 && num3 > num2)
        {
            System.out.print(num3 + " ");
            if (num1 > num2)
                System.out.print(num1+ " " + num2);
            else
                System.out.print(num2+ " "+ num1);
        }
    }
}
