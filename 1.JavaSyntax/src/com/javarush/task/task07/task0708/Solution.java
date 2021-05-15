package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        ArrayList<String> text = new ArrayList<>();

        Scanner scanner= new Scanner(System.in);
        for (int i= 0; i<5;i++){
            text.add(scanner.nextLine());
        }

        int maxStringLength = text.get(0).length();
        for (String string : text) {
            if (string.length() > maxStringLength) {
                maxStringLength = string.length();
            }
        }

        for (String string : text) {
            if (string.length() == maxStringLength) {
                System.out.println(string);
            }
        }




    }
}
