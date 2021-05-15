package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] bigList =  new int[20];


        for (int i = 0;i<20;i++){
            bigList[i] = Integer.parseInt(scanner.nextLine());
        }
        int[]firstList = new int[10];
        int[]secondList = new int[10];

        for (int i= 0; i<10;i++){
            firstList[i] = bigList[i];
            secondList[i]= bigList[i+10];
        }

        for (int i =0; i <10;i++){
            System.out.println(secondList[i]);
        }


    }
}
