package Lesson7HW;

import java.util.Scanner;

public class HomeWorkApp7 extends Object {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        String stringTest = "Test";
        StringBuilder stringBuilder = new StringBuilder("Test");

        long start = System.nanoTime();

        for (int i = 0; i < 60000; i++) {
            stringTest += i;
        }

        float finish = System.nanoTime() - start;

        System.out.println(stringTest);
        System.out.println("Test time string = " + finish * 0.000001f + " millisec");


        start = System.nanoTime();

        for (int i = 0; i < 60000; i++) {
            stringBuilder.append(i); 
        }

        finish = System.nanoTime() - start;

        System.out.println(stringBuilder.toString());
        System.out.println("Test time stringBuilder = " + finish * 0.000001f + " millisec");
        System.out.println(stringTest.equals(stringBuilder.toString()));

    }
    }
