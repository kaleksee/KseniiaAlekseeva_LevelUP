package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.startCalculator();
    }

    public void startCalculator() {
        Addition addition = new Addition();
        double additionResult = addition.add();
        System.out.println("Addition result = " + additionResult);
        Substraction substraction = new Substraction();
        int substractionResult = substraction.substract();
        System.out.println("Substraction result = " + substractionResult);
        Multiplication multiplication = new Multiplication();
        double multiplicationResult = multiplication.multiply();
        System.out.println("Multiplication result = " + multiplicationResult);
        Power power = new Power();
        double raiseToPowerResult = power.raiseToPower();
        System.out.println("Result of raising to power = " + raiseToPowerResult);
        Factorial factorial = new Factorial();
        double factorialResult = factorial.calculateFactorial ();
        System.out.println("Result of factorial = " + factorialResult);
    }
}
