package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int[] list = new int[]{a,b,c,d,e};
        sort(list);

        for (int x : list) {
            System.out.println(x);
        }
    }
    public static void sort (int[] list){
            for (int i = list.length-1; i>0;i--){
                for (int j = 0 ; j < i; j++){
                    if (list[j]>list[j+1]){
                        int tmp = list[j];
                        list[j]= list[j+1];
                        list[j+1] = tmp;
                    }
                }
            }
    }

}
