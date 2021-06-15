package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
Есть класс кот – Cat, с полем «имя» (String).
Создать словарь Map<String, Cat> и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех котов и вывести его на экран.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. Метод createMap должен объявлять и инициализировать переменную типа HashMap.
3. Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
4. Метод createMap должен возвращать созданный словарь.
5. Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
6. Программа должна вывести всех котов из множества на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> m = new HashMap<>();
        m.put("Vaska0", new Cat("Vaska0"));
        m.put("Vaska1", new Cat("Vaska1"));
        m.put("Vaska2", new Cat("Vaska2"));
        m.put("Vaska3", new Cat("Vaska3"));
        m.put("Vaska4", new Cat("Vaska4"));
        m.put("Vaska5", new Cat("Vaska5"));
        m.put("Vaska6", new Cat("Vaska6"));
        m.put("Vaska7", new Cat("Vaska7"));
        m.put("Vaska8", new Cat("Vaska8"));
        m.put("Vaska9", new Cat("Vaska9"));
        return m;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<Cat>();
        Iterator <Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            set.add(iterator.next().getValue());
        }

        return (Set<Cat>) set;
    }


    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
