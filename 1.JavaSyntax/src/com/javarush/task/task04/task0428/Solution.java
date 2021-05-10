package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int counter = 0;
        if (num1 > 0) {
            counter++;
        }
        if (num2 > 0) {
            counter++;
        }
        if (num3 > 0) {
            counter++;
        }
        System.out.println(counter);
    }
}
