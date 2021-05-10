package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       String text = scanner.nextLine();
       int num = scanner.nextInt();

       while (num >0){
           System.out.println(text);
           num--;
       }

    }
}
