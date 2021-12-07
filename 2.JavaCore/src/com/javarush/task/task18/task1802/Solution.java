package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fname = reader.readLine();

        int minByte = 255;
        try (FileInputStream fIS = new  FileInputStream(fname)) {
            while (fIS.available() > 0){
                int currByte = fIS.read();
                if (currByte < minByte) minByte = currByte; 
            }
        }
        System.out.println(minByte);
    }
}
