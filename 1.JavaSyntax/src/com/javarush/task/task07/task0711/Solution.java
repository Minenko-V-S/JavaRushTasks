package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> text = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<5;i++){
         String s = scanner.nextLine();
            text.add(s);
        }
        for (int i = 0;i<13;i++){
            String s = text.remove(4);
            text.add(0, s);
        }
        for (String s: text){
            System.out.println(s);
        }
    }
}
