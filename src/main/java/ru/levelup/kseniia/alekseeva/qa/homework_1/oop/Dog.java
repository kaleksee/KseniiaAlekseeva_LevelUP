package ru.levelup.kseniia.alekseeva.qa.homework_1.oop;

public class Dog extends Animal implements Swimmable {

    private static final String VOICE = "ГАВ!";
    private String keeper;
    private String breed;
    private boolean sex;

    public Dog(String name, double weight) {
        super(name, "Dog");
        super.weight = weight;
    }

    public Dog(String name) {
        super(name, "Dog");
    }

    public String getKeeper() {
        return keeper;
    }

    public void setKeeper(String keeper) {
        this.keeper = keeper;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void say() {
        System.out.println(VOICE);
    }

    public void swim () {
        System.out.println("Dog swim");
    }
}
