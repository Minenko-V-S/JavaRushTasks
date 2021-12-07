package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{

BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
String inputFile1 = r.readLine();
String outputFile2 = r.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile1);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile2)) {

            List<Integer> inputBytes = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                inputBytes.add(fileInputStream.read());
            }
            Collections.reverse(inputBytes);
            for (Integer aByte : inputBytes) {
                fileOutputStream.write(aByte);
            }
        }
    }
}
