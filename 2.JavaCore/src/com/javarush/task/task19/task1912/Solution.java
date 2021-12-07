package com.javarush.task.task19.task1912;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка 2
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        testString.printSomething();
        System.setOut(consoleStream);

        String result = outputStream.toString();
        result = result.replaceAll("te", "??");
        System.out.println(result);
        
    }


    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
