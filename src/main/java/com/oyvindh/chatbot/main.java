package com.oyvindh.chatbot;

import java.util.Scanner;

public class main {
    final static Scanner scanner = new Scanner(System.in);
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name. ");
    }
    static void remindName() {
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("Øyvind")) {
            System.out.println("That name... is questionable... well, let's just move on " + name + "! :) ");
        } else if (name.equalsIgnoreCase("Tormod")){
            System.out.println("What a great name you have, " + name + "!");
        } else {
            System.out.println("Can we get an early christmas break? Like start now? Pretty please?");
        }
    }
    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7. ");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + ", that's a good time to start programming!");
    }
    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }
    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods? \n1. To repeat a statement multiples times. \n2. To decompose a program into several small subroutines. "
                + "\n3. To determine the execution time of a program. \n4. To interrupt the execution of a program. ");
        while(true) {
            int choice = scanner.nextInt();
            if (choice == 4) {
                System.out.println("Correct answer!");
                break;
            } else {
                System.out.println("Please, try again.");
            }
        }
    }
    static void answerGetter() {
        System.out.println("Welcome to the counter. Please start by saying '1', and the machine will continue with every other number. Be wary, if you skip a number, you fail.");
        int answerFromUser = scanner.nextInt();
        int currentNumber = 0;
        while (answerFromUser < 10) {
            if (answerFromUser == ++currentNumber) {
                System.out.println(answerFromUser + 1);
                ++currentNumber;
                answerFromUser = scanner.nextInt();
            } else {
                break;
            }
        }
    }

    static void end() {
        System.out.println("Congrats, have a nice day!");
    }

    public static void main(String[] args) {
        greet("IMHaugalandBot", "2021");
        remindName();
        answerGetter();
        guessAge();
        count();
        test();
        end();
    }
}




