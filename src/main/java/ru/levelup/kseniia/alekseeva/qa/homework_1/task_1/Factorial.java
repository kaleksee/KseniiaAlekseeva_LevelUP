package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    public long calculateFactorial() {
        try {
            CalculatorInput calculatorInput = new CalculatorInput();
            int variableA = calculatorInput.processInputInteger();
            return calculateFactorial(variableA);


        } catch (InputMismatchException any) {
            throw new RuntimeException("Please check the input! Int expected!");

        }
    }

    private long calculateFactorial (int a) {
        if (a == 0) {
            return 1;

        } else {
            int fact=1;
            for(int i=1;i<=a;i++){
                fact=fact*i;

            }
            return fact;
        }

    }
}


