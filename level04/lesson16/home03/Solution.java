package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.Scanner;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int breakPoint = sc.nextInt();
            counter = breakPoint+counter;
            if (breakPoint == -1){
                break;
            }
        }
        System.out.println(counter);



    }
}
