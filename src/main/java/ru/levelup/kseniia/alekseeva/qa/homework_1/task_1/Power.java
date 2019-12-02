package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Power {
    public double raiseToPowerMath () {
        try {
            CalculatorInput calculatorInput = new CalculatorInput();
            double variableA = calculatorInput.processInputDouble();
            int variableB = calculatorInput.processInputInteger();
            double result = 1;
            for (int i=1; i<=variableB; i++){
                result *= variableA;
            }
            return result;
        } catch (InputMismatchException any) {
            throw new RuntimeException("Please check the input! A should be double, B should be integer!");

        }

    }
}
