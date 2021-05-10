package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        System.out.println(name + " получает " + age1 + " через " + age2 + " лет." );

    }
}
