package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Substraction {
    public int substractTwoNumbers() {
        try {
            CalculatorInput calculatorInput = new CalculatorInput();
            int variableA = calculatorInput.processInputInteger();
            int variableB = calculatorInput.processInputInteger();
            return (variableA - variableB);
        }
        catch (InputMismatchException any) {
            throw new RuntimeException("Please check the input! Int expected!");
        }

    }



}
