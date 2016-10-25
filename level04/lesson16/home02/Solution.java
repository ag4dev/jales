package com.javarush.test.level04.lesson16.home02;

import java.io.*;
import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int maxQ = max(max(num1,num2),max(num2,num3));
        int minQ = min(min(num1,num2),min(num2,num3));


        if (num1 != maxQ && num1 != minQ)
            System.out.println(num1);
        if (num2 != maxQ && num2 != minQ)
            System.out.println(num2);
        if (num3 != maxQ && num3 != minQ)
            System.out.println(num3);

    }

    public static int max (int a, int b){
        if (a>b){
            return a;
        } else {
            return b;
        }
    }

    public static int min (int a, int b){
        if (a<b){
            return a;
        } else {
            return b;
        }
    }

}
