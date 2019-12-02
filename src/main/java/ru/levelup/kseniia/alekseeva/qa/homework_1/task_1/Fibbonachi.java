package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibbonachi {
    public int calculateFibbonachiRecursion() {
        try {
            CalculatorInput calculatorInput = new CalculatorInput();
            int variableA = calculatorInput.processInputInteger();
            if (variableA < 0) {
                throw new NegativeNumberException ("Please check the input! A shoud be >= 0!");
            }
            return calculateFibbonachiNumber(variableA);


        } catch (InputMismatchException any) {
            throw new RuntimeException("Please check the input! Int expected!");
        }
    }


    int calculateFibbonachiNumber (int variableA){
        if(variableA <= 1){
            return variableA;
        }
        int fibbonachiNumber = 1;
        int previousFibbonachiNumber = 1;
        for(int i = 2; i < variableA; ++i){
            int temp = fibbonachiNumber;
            fibbonachiNumber += previousFibbonachiNumber;
            previousFibbonachiNumber = temp;
        }
        return fibbonachiNumber;
    }
}
