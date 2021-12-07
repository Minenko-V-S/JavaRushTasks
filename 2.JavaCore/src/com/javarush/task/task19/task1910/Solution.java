package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        String inputFile;
        String outputFile;

        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
            inputFile = r.readLine();
            outputFile = r.readLine();
        }

        ArrayList<String> file = new ArrayList<String>();
        try (BufferedReader IFR = new BufferedReader(new FileReader(inputFile))){
            while (IFR.ready()) {
                file.add(IFR.readLine());
            }
        }
        try (BufferedWriter OFW = new BufferedWriter(new FileWriter(outputFile))) {
            for (String s : file){
                OFW.write(s.replaceAll("\\p{P}", ""));
            }
        }
    }
}
