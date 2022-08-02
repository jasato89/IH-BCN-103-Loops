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

        int[] nums = {1, 4, 6, 7, 9};
        // Dado un array, que multiplique el número siguiente del array

        System.out.println("===Ejercicio 1===");
        for(int z : multiplyNumbers(nums)) {
            System.out.println(z);
        }

        //Dado un array, invertirlo
        System.out.println("===Ejercicio 2===");
        invertArray(nums);

        System.out.println("===Ejercicio 3 ===");
        sumaNumeros(5);

        System.out.println("===Ejercicio 4 ===");
        printEvenNumbers(nums);


    }

    public static void printEvenNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }

        }
    }

    public static void sumaNumeros(int i) {
        int sum = 0;
        for (int j = 0; j <= i; j++) {
            sum += j;
        }
           System.out.println(sum);

    }

    public static void invertArray(int[] numbers) {
        for(int i = numbers.length-1; i >=0; i--) {
            System.out.println(numbers[i]);
        }
    }

    public static int[] multiplyNumbers(int[] numbers) {

        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                result[i] =numbers[i] * numbers[i+1];
            } else {
                result[i]= numbers[i] * numbers[0];
            }

        }

        return result;

    }

    public static void sayHello() {
        System.out.println("Hello");
    }
    public static void printText(String text) {
        System.out.println(text);
    }

    public static void sayGoodbye() {
        System.out.println("Goodbye");
    }



}
