package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;



/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a <= 0) {
            return;
        }

        int[] data = new int[a];
        for (int i = 0; i < a; i++) {
            data[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = data[0];
        for (int i = 1; i < a; i++) {
            if (data[i] > maximum) {
                maximum = data[i];
            }
        }

        System.out.println(maximum);
    }


}
