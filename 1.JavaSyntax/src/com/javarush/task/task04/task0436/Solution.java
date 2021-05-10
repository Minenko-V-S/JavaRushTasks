package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0;i < n; i++){
            for (int j = 0; j< m; j++){
                System.out.print('8');
            }
            System.out.println();
        }

    }
}
