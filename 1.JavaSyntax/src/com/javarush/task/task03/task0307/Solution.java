package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
       Zerg zerg1 = new Zerg();
        Zerg zerg2 = new Zerg();
        Zerg zerg3 = new Zerg();
        Zerg zerg4 = new Zerg();
        Zerg zerg5 = new Zerg();
        zerg1.name = "Zerg1";
        zerg2.name = "Zerg2";
        zerg3.name = "Zerg3";
        zerg4.name = "Zerg4";
        zerg5.name = "Zerg5";

        Protoss protos1 = new Protoss();
        Protoss protos2 = new Protoss();
        Protoss protos3 = new Protoss();
        protos1.name= "Protos1";
        protos2.name = "Protos2";
        protos3.name = "Protos3";

        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran terran3 = new Terran();
        Terran terran4 = new Terran();
        terran1.name = "Terran1";
        terran2.name= "Terran2";
        terran3.name = "Terran3";
        terran4.name= "Terran4";

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
