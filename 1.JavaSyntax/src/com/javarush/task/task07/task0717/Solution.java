package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        for (int i =0; i<10;i++){
            list.add(scanner.nextLine());
        }

        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result
        for (String s: result){
            System.out.println(s);
        }

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list2=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            list2.add(list.get(i));
            list2.add(list.get(i));
        }
        return list2;
    }
}
