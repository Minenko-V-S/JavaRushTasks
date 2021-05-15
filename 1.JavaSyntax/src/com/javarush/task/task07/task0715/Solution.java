package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        text.add("мама");
        text.add("мыла");
        text.add("раму");

        text.add(1,"именно");
        text.add(3,"именно");
        text.add(5,"именно");

        for (String s: text){
            System.out.println(s);
        }
    }
}
