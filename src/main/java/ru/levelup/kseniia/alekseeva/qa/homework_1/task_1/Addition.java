package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Addition {
    public double addTwoDoubles() {

        try {
            CalculatorInput calculatorInput = new CalculatorInput();
            double variableA = calculatorInput.processInputDouble();
            double variableB = calculatorInput.processInputDouble();
            return (variableA + variableB);
        } catch (InputMismatchException any) {
            throw new RuntimeException("Please check the input! Double expected!");
        }

    }
}
