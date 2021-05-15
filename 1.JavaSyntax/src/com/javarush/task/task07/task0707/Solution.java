package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<String>();

        text.add("1");
        text.add("2");
        text.add("3");
        text.add("4");
        text.add("5");

        System.out.println(text.size());
        for (int i =0; i< text.size();i++){
            System.out.println(text.get(i));
        }
    }
}
