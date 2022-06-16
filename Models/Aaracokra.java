package Models;

import java.util.HashMap;

import Interfaces.Fly;


public class Aaracokra extends Race implements Fly {
    
    public Aaracokra(HashMap<String,Integer> asi, int age, String alignment, String size) {
        super("Birdman", asi, age, alignment, size, 25);
    }

    public void fly() {
        System.out.println("I can fly!");
    }

    public void fly(int distance) {
        System.out.println("The birdman flew " + distance + " feet");
    }

    public int getFlySpeed() {
        return flySpeed;
    }
}
