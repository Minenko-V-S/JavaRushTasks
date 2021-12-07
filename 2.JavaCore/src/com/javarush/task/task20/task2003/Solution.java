package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/

public class Solution {

    public static Map<String, String> runtimeStorage = new HashMap<>();

    public static void save(OutputStream outputStream) throws Exception {
        Properties p = new Properties();
        for (Map.Entry<String, String> pair : runtimeStorage.entrySet()){
            p.setProperty(pair.getKey(), pair.getValue());
            
        }
        
        p.store(outputStream, null);
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties p = new Properties();
        p.load(inputStream);
        
        for (Map.Entry<Object, Object> pair : p.entrySet()) {
            runtimeStorage.put(pair.getKey().toString(), pair.getValue().toString());
            
        }
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream fos = new FileInputStream(reader.readLine())) {
            load(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);
    }
}
