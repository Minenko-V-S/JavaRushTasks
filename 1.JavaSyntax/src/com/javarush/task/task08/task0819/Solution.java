package com.javarush.task.task08.task0819;


import java.util.HashSet;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.iterator().next());//напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> r = new HashSet<>();//напишите тут ваш код. step 2 - пункт 2
        r.add(new Cat());
        r.add(new Cat());
        r.add(new Cat());
        return r;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat: cats)// step 4 - пункт 4
        {
        System.out.println(cat);
        }
    }

    private static class Cat { // step 1 - пункт 1
    }
}
