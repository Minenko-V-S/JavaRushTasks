package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {

        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(15);
        set.add(25);
        set.add(40);
        set.add(8);
        set.add(12);
        set.add(18);
        set.add(7);
        set.add(65);
        set.add(84);

        set.add(90);
        set.add(11);
        set.add(4);
        set.add(2);
        set.add(86);
        set.add(74);
        set.add(55);
        set.add(22);
        set.add(48);
        set.add(53);

        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Set<Integer> r = new HashSet<>(set);
        for (Integer number : r){
            if (number > 10){
                set.remove(number);
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
