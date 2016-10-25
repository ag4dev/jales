package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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

        System.out.println("количество отрицательных чисел: " + (checkMinus(num1) + checkMinus(num2) + checkMinus(num3)));
        System.out.println("количество положительных чисел: " + (checkPlus(num1) + checkPlus(num2) + checkPlus(num3)));
    }

    public static int checkPlus(int a){
        if (a >= 0){
            return 1;
        } else {
            return 0;
        }
    }
    public static int checkMinus(int a){
        if (a < 0){
            return 1;
        } else {
            return 0;
        }
    }
}
