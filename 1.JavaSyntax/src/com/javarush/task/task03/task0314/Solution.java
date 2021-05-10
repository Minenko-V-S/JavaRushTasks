package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("   1  2  3  4  5  6  7  8  9 10");
        int i = 1;
        while (i<11){
            System.out.print(i + " | ");
            int j = 2;
            while (j<11){
                int tabl = i*j;
                if (tabl<11)
                    System.out.print(tabl + "  ");
                        else System.out.print(tabl + " ");
                        j++;
            }System.out.println();
            i++;
        }


    }
}
