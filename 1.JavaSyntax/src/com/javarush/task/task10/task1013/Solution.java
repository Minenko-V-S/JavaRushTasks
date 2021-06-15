package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.

Программа не должна считывать данные с клавиатуры.
В классе Human должно быть 6 полей.
Все поля класса Human должны быть private.
В классе Human должно быть 10 конструкторов.
Все конструкторы класса Human должны быть public.

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private int age;
        private int phone;
        private int height;
        private String sax;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;
        }

        public Human(String name, String surname, int age, int phone) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.phone = phone;
        }

        public Human(String name, String surname, int age, int phone, int height) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.phone = phone;
            this.height = height;
        }

        public Human(String name, String surname, int age, int phone, int height, String sax) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.phone = phone;
            this.height = height;
            this.sax = sax;
        }

        public Human(String name, String surname, String sax) {
            this.name = name;
            this.surname = surname;
            this.sax = sax;
        }

        public Human(String name, int phone) {
            this.name = name;
            this.phone = phone;
        }

        public Human(int phone, int height) {
            this.phone = phone;
            this.height = height;
        }

        public Human() {
        }
    }
}
