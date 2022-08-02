package com.ironhack;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	String goodMorning = "Good Morning";
    goodMorning += " class";
    printText(goodMorning);
    sayHello();

    String[] names = {"Jaume", "Pedro", "Jose", "Alejandro"};
        System.out.println(names);

        System.out.println("=== FOR LOOP ===");
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        System.out.println("===While LOOP ===");

        int i = 0;
        while (i < names.length) {
            System.out.println(names[i++]);
        }

        System.out.println("===DO WHILE LOOP===");

        i = 0;
        do {
            System.out.println(names[i++]);
        } while (i < names.length);


        System.out.println("=== FOR EACH LOOP===");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("===STREAM===");

        Arrays.asList(names).stream().forEach(System.out::println);


    }

    public static void sayHello() {
        System.out.println("Hello");
    }
    public static void printText(String text) {
        System.out.println(text);
    }

}
