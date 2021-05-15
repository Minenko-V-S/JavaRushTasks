package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> text = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        for(int i = 0;i<10;i++){
            text.add(scanner.nextLine());
        }
        int minLength = text.get(0).length(), maxLength = text.get(0).length();
        for(String lists : text){
            if(lists.length()<minLength){
                minLength = lists.length();
            }
        }
        for(String lists : text){
            if(lists.length()>maxLength){
                maxLength = lists.length();
            }
        }
        for(String lists : text){
            if(lists.length() == minLength){
                System.out.println(lists);
                return;
            }
            else if (lists.length() == maxLength){
                System.out.println(lists);return;
            }
        }
    }
}
