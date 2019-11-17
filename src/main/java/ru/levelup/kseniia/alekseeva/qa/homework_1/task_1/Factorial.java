package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    public long calculateFactorial() {
        try {
            System.out.println("Input int A");
            Scanner input = new Scanner(System.in);
            int variableA = input.nextInt();
            return doRecursion(variableA);


        } catch (InputMismatchException any) {
            throw new RuntimeException("Please check the input! Int expected!");

        }
    }

    private long doRecursion(int a) {
        if (a == 0) {
            return 1;

        } else {
            return (a * doRecursion(a - 1));
        }

    }
}


