package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

import java.util.Scanner;

public class Substraction {
    public int substract() {
        System.out.println("Input integer A");
        Scanner input = new Scanner(System.in);
        int variableA = input.nextInt();
        System.out.println("Input integer B");
        int variableB = input.nextInt();
        return (variableA - variableB);
    }


}
