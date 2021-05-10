package com.javarush.task.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
18+
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

        if (age < 18) { System.out.println("Подрасти еще"); }

    }
}
