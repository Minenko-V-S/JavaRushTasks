package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int yaer = scanner.nextInt();

       int day;

       if (yaer % 400 ==0){day=366;}
       else if (yaer %100 ==0){day=365;}
       else if (yaer %4 ==0){day=366;}
       else day=365;
       System.out.println("количество дней в году: " + day);


    }
}