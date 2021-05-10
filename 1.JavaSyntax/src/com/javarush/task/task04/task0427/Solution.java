package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.function.Supplier;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        boolean a1 = num > 0 && num < 10;
        boolean a2 = num > 9 && num < 100;
        boolean a3 = num > 99 && num < 1000;
        boolean b = num % 2 == 0;

        if (a1) {
            if (b) {
                System.out.println("четное однозначное число");
            } else {
                System.out.println("нечетное однозначное число");
            }
        } else if (a2) {
            if (b) {
                System.out.println("четное двузначное число");
            } else {
                System.out.println("нечетное двузначное число");
            }
        }else if (a3){
            if(b){
                System.out.println("четное трехзначное число");
            } else {
                System.out.println("нечетное трехзначное число");
            }
        }
    }
}