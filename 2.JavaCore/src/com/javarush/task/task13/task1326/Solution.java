package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args)throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String  file = read.readLine();
        FileInputStream InputStream = new FileInputStream(file);

        Scanner scanner = new Scanner(file);
        List<Integer> data = new ArrayList<Integer>();

        while (scanner.hasNext()) {
            int value = scanner.nextInt();
            if (value % 2 == 0)data.add(value);
            
        }
        Collections.sort(data);

        for (Integer value : data)
            System.out.println(value);

        scanner.close();
        InputStream.close();
    }
}
