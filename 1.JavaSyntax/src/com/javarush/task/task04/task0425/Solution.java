package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();


        System.out.print(1 + (x*y<0 ? 1 : 0) + 2*(y<0 ? 1 : 0));
    }
}
