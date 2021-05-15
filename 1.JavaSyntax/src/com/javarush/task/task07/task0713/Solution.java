package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> bigList = new ArrayList<>();
        for (int i = 0;i<20;i++) {
            int x = scanner.nextInt();
            bigList.add(x);
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for (int i = 0;i<20;i++){
            int x = bigList.get(i);

            if ((x % 3 == 0) || (x % 2 == 0)) {
                if (x % 3 == 0) {
                    list2.add(x);
                }
                if (x % 2 == 0) {
                    list3.add(x);
                }
            }else list4.add(x);

        }

        printList(list2);
        printList(list3);
        printList(list4);

    }

    public static void printList(ArrayList<Integer> list) {
        for (int x : list) {
            System.out.println(x);
        }
    }
}
