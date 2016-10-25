package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int intLenght = String.valueOf(a).length();

        if (a > 0 && a < 1000)
        {
            if (a % 2 == 0)
            {
                System.out.print("четное ");
                gu(intLenght);
            } else
            {
                System.out.print("нечетное ");
                gu(intLenght);
            }
        }
    }

    public static void gu(int a){
        if (a == 1)
            System.out.print ("однозначное число");
        if (a == 2)
            System.out.print ("двузначное число");
        if (a == 3)
            System.out.print ("трехзначное число");
    }

}