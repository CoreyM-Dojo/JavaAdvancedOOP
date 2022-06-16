package Models;

import java.util.HashMap;

public abstract class Race {

    private String name;
    private HashMap<String, Integer> asIncrease;
    private int age;
    private String alignment;
    private String size;
    private int walkSpeed;

    public Race(String name, HashMap<String,Integer> asi, int age, String alignment, String size, int walkSpeed) { 
        this.name = name;
        this.asIncrease = asi;
        this.age = age;
        this.alignment = alignment;
        this.size = size;
        this.walkSpeed = walkSpeed;
    }

    public void walk() {
        System.out.println(this.name + " walked " + this.walkSpeed + " feet");
    }


    // ----------------------------- Getters & Setters --------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAsIncrease(HashMap<String, Integer> asIncrease) {
        this.asIncrease = asIncrease;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public int getWalkSpeed() {
        return walkSpeed;
    }
    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }


}