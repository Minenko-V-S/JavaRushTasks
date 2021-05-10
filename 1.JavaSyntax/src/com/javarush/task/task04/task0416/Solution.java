package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
         t = t % 5;

            if (t >= 0 && t <3){System.out.println("зелёный");}
            else if (t >=3 && t < 4){System.out.println("жёлтый");}
            else {System.out.println("красный");}
        }

    }
