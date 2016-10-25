package com.javarush.test.level06.lesson08.task04;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        //напишите тут ваш код
        Scanner scString = new Scanner(System.in);
        String a = scString.nextLine();
        return a;
    }

    public static int readInt() throws Exception
    {
        //напишите тут ваш код
        Scanner scInt = new Scanner(System.in);
        int b = scInt.nextInt();
        return b;
    }

    public static double readDouble() throws Exception
    {
        //напишите тут ваш код
        Scanner scDouble = new Scanner(System.in);
        Double c = scDouble.nextDouble();
        return c;
    }

    public static boolean readBoolean() throws Exception
    {
        //напишите тут ваш код
        Scanner scBoolean = new Scanner(System.in);
        Boolean d = scBoolean.nextBoolean();
        return d;
    }
}
