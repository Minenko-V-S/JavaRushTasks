package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String>text = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<5;i++){
            text.add(scanner.nextLine());
        }

        int minStringLength  = text.get(0).length();
        for (String string : text) {
            if (string.length() < minStringLength) {
                minStringLength = string.length();
            }
        }

        for (String string : text) {
            if (string.length() == minStringLength) {
                System.out.println(string);
            }
        }
    }
}
