package Main;

import java.util.HashMap;
import Models.*;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> asi = new HashMap<>();
        asi.put("Dexterity", 2);
        asi.put("Wisdom", 1);
        // Race race = new Race("NEWR", asi, 20, "Good", "Medium" , 30  );
        Aaracokra a = new Aaracokra(asi, 20, "Good", "Medium");
        Aaracokra a2 = new Aaracokra(asi, 20, "Good", "Medium");
        System.out.println(a.getName()); 
        System.out.println(a2.getName()); 
        System.out.println(a.getWalkSpeed());
        System.out.println(a2.getWalkSpeed());

        Human batman = new Human(asi, 50, "Neutral", "Medium");
        batman.getName();
        batman.walk();
        batman.fly();
        // a.fly();
        a.fly(10);
    }   
}