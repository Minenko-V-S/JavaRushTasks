package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> text = new ArrayList<>();
        for (int i = 0;i < 5;i++){
            String s = scanner.nextLine();
            text.add(s);
        }
        text.remove(2);

        for (int i = text.size() - 1; i >= 0; i--){
            String s = text.get(i);
            System.out.println(s);
        }
    }
}
