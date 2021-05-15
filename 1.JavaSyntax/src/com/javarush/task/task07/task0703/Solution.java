package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       String[] text = new String[10];
       int[] num = new int[10];

       for (int i = 0; i < 10; i++){
           text[i] = scanner.nextLine();
           num[i] = text[i].length();
       }

       for (int i = 0; i <10;i++){
           System.out.println(num[i]);
       }
    }
}
