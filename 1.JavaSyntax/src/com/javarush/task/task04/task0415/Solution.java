package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int c = scanner.nextInt();

        if ((a<b+c) && (b>c+a)  && (c<a+b)){
            System.out.println("Треугольник существует.");
        }else System.out.println("Треугольник не существует.");
    }
}