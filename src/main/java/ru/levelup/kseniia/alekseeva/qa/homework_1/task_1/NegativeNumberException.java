package ru.levelup.kseniia.alekseeva.qa.homework_1.task_1;

public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException (String errorMessage) {
        super(errorMessage);
    }
}
