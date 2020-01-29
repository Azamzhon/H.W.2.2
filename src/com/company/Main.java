package com.company;

import java.util.Random;

public class Main {
    public static int age;
    public static int age2;
    public static int age3;

    public static void main(String[] args) {
        generateRandomAge();
        String name = "Ваня";
        int temperature = -3;
        if (age > 20 && age < 45 && temperature < 30 && temperature > -20) {
            System.out.println(name + ", " + "Можно идти гулять");
        } else {
            System.out.println(name + ", " + "Лучше остаться дома");
        }
        String name2 = "Аъзамжон";
        int temperature2 = -7;

        if (age2 < 20 && temperature2 < 28 && temperature2 > 0) {
            System.out.println(name2 + ", " + "Можно идти гулять");
        } else {
            System.out.println(name2 + ", " + "Лучше остаться дома");
        }
        String name3 = "Гена";
        int temperature3 = 10;

        if (age3 > 45 && temperature3 < 25 && temperature3 > -10) {
            System.out.println(name3 + ", " + "Можно идти гулять");
        } else {
            System.out.println(name3 + ", " + "Лучше остаться дома");
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        age = random.nextInt(107);
        return age;
    }
}
