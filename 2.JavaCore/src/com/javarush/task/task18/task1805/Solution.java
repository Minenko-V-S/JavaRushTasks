package com.javarush.task.task18.task1805;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fn = bufferedReader.readLine();
        
        Set<Integer> bytes = new TreeSet<>();
        File file;
        try (FileInputStream fis = new FileInputStream(fn)){
            while (fis.available() > 0){
                bytes.add(fis.read());
            }
        }
        for (Integer aByte : bytes){
            System.out.println(aByte + " ");
        }
    }
}
