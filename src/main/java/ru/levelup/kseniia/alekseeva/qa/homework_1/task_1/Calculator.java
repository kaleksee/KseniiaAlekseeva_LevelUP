package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.startCalculator();
    }

    public void startCalculator() {
        System.out.println("Welcome to my calculator!");
        System.out.println("Please, choose operation");
        System.out.println("Input 'sum' if you want to sum two numbers");
        System.out.println("Input 'sub' if you want to substract two numbers");
        System.out.println("Input 'mult' if you want to multiply two numbers");
        System.out.println("Input 'power' if you want to raise one numbers to power");
        System.out.println("Input 'fact' if you want to calculate factorial of a number");
        System.out.println("Input 'fibo' if you want to calculate fibbonachi number");
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        switch (in) {
            case "sum":
                Addition addition = new Addition();
                double additionResult = addition.addTwoDoubles();
                System.out.println("Addition result = " + additionResult);
                break;
            case "sub":
                Substraction substraction = new Substraction();
                double substractionResult = substraction.substractTwoNumbers();
                System.out.println("Substraction result = " + substractionResult);
                break;
            case "mult":
                Multiplication multiplication = new Multiplication();
                double multiplicationResult = multiplication.multiplyDouble();
                System.out.println("Multiplication result = " + multiplicationResult);
                break;
            case "power":
                Power power = new Power();
                double raiseToPowerResult = power.raiseToPowerMath();
                System.out.println("Result of raising to power = " + raiseToPowerResult);
                break;
            case "fact":
                Factorial factorial = new Factorial();
                long factorialResult = factorial.calculateFactorialRecursion();
                System.out.println("Result of factorial = " + factorialResult);
                break;
            case "fibo":
                Fibbonachi fibbonachi = new Fibbonachi();
                double fib = fibbonachi. calculateFibbonachiRecursion();
                System.out.println("Number in Fibbonachi sequence = " + fib);
                break;
            default: {
                throw new UnsupportedOperationException("Function '" + in + "' is not supported in my calculator!");
            }
        }

    }
}

