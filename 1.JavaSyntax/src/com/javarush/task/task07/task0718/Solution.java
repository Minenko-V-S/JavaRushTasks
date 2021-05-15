package com.javarush.task.task07.task0718;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Проверка на упорядоченность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        for (int i =0;i<10;i++){
            String s = scanner.nextLine();
            list.add(s);
        }

        String bugString = list.get(0);

        for (int i =1;i<10;i++){
            if (list.get(i).length() >= bugString.length()){
                bugString = list.get(i);
            }else{
                System.out.println(i);
            break;}
        }
    }
}
