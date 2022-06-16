package Models;

import java.util.HashMap;

public class Human extends Race {
    
    
        public Human(HashMap<String,Integer> asi, int age, String alignment, String size) {
            super("Batman", asi, age, alignment, size, 30);
        }

        public void fly() {
            System.out.println("What are you doing? Batman can't fly!");
        }

        
}
