package ru.levelup.kseniia.alekseeva.qa.homework_1.oop;

public class Fish extends Animal implements  Swimmable {
    private String color;
    private boolean seaAreaType;



    public Fish (String name) {
        super(name, "fish");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSeaAreaType() {
        return seaAreaType;
    }

    public void setSeaAreaType(boolean seaAreaType) {
        this.seaAreaType = seaAreaType;
    }
    public void swim () {
        System.out.println("Fish swim");
    }


}
