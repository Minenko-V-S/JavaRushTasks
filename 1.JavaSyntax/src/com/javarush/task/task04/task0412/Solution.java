package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();

        if (num >0 ){num = num*2;}
        else if (num<0){num = num+1;}
        System.out.println(num);


    }

}