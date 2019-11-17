package ru.levelup.kseniia.alekseeva.qa.homework_1.oop;

public class Main {

    public static void main(String[] args) {
        Dog larry = new Dog("Larry");
        Dog dog = new Dog("Dig");
        Dog sharik = new Dog("Sharik");
        Dog bobik = new Dog("Bobik");

        Fish nemo = new Fish("Nemo");
        Fish flanders = new Fish("Flanders");
        Fish dorry = new Fish("Dorry");

        Swimmable [] swimmingAnimals = {larry, dog, sharik, bobik, nemo, flanders, dorry};

        for (Swimmable sa : swimmingAnimals) {
            sa.swim();
        }
    }
}
