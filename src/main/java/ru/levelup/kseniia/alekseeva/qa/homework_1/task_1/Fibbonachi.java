package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibbonachi {
    public int calculateFibbonachi() {
        try {
            System.out.println("Input int A >= 0");
            Scanner input = new Scanner(System.in);
            int variableA = input.nextInt();
            if (variableA < 0) {
                throw new RuntimeException("Please check the input! A shoud be >= 0!");
            }
            return doRecursion(variableA);


        } catch (InputMismatchException any) {
            throw new RuntimeException("Please check the input! Int expected!");
        }
    }

    public int doRecursion(int a) {

        if (a == 0) {
            return 0;
        }
        if (a == 1 | a == 2) {
            return 1;
        }
        return doRecursion(a - 2) + doRecursion(a - 1);
    }
}
