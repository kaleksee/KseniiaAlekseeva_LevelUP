package ru.levelup.kseniia.alekseeva.qa.homework_1.oop;

public abstract class Animal {
    protected double weight;
    private double height;
    private int age;
    protected String voice;
    private String name;
    private String type;

    protected Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void say () {
        System.out.println(type + " " + name + " says " + voice);
    }

}
