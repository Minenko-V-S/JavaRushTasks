package com.javarush.task.task07.task0704;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i <10; i++){
            num[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = num.length -1; i>=0;i-- ){
            System.out.println(num[i]);
        }
    }
}

