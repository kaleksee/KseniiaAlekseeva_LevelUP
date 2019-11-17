package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Substraction {
    public int substract() {
        try {
            System.out.println("Input integer A");
            Scanner input = new Scanner(System.in);
            int variableA = input.nextInt();
            System.out.println("Input integer B");
            int variableB = input.nextInt();
            return (variableA - variableB);
        }
        catch (InputMismatchException any) {
            throw new RuntimeException("Please check the input! Int expected!");
        }

    }

    public void testMethod () {

    }


}
