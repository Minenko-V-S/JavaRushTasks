package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        while (true){
            int numbre = Integer.parseInt(scanner.nextLine());

            if (numbre == -1){
                System.out.println(sum / count);
                return;
            }
            count++;
            sum += numbre;
        }
    }
}

