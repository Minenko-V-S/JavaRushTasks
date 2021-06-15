package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Количество букв

Введи с клавиатуры 10 строчек и посчитай в них количество различных
букв без учета регистра. Результат выведи на экран в алфавитном порядке.

Программа должна 10 раз считывать данные с клавиатуры.
Программа должна выводить текст на экран.
Выведенный текст должен содержать 33 строки.
Каждая строка вывода должна содержать букву русского алфавита,
пробел и количество раз, которое буква встречалась в введенных строках.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }

        int count = 0;

        for (char abc : alphabet){
            for (String lonelyString : list) {
                for (char symbol : lonelyString.toCharArray()) {
                    if(abc == symbol)
                        count++;
                }
            }
            System.out.println(abc + " " + count);
            count = 0;
        }

        // напишите тут ваш код
    }
}
