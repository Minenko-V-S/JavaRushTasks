package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a != b && b==c){
            System.out.println("1");
        }else if (b != a && a==c){
            System.out.println("2");
        }else if (c != a && a ==b){
            System.out.println("3");
        }


    }
}
