package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human Grandfather1 = new Human("Петр", true, 61);
        Human Grandmother1 = new Human("Мария", false, 60);

        Human Grandfather2 = new Human("Петр", true, 61);
        Human Grandmother2 = new Human("Мария", false, 60);

        Human father = new Human("Влад", true, 42);
        Human mother = new Human("Анасасия", false, 40);

        Human firstChild = new Human("Игорь", true, 15, father, mother);
        Human secondChild = new Human("Сергей", false, 10, father, mother);
        Human thirdChild = new Human("Виктор", true, 5, father, mother);

        System.out.println(Grandfather1);
        System.out.println(Grandmother1);
        System.out.println(Grandfather2);
        System.out.println(Grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(firstChild);
        System.out.println(secondChild);
        System.out.println(thirdChild);




    }

    public static class Human {
        public String name;
        public boolean sex;
        public int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}