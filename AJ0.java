// Using the Collection interface with an ArrayList
import java.util.*;

public class AJ0 {
    public static void main(String[] args) {
      
        // Create a Collection using ArrayList
        Collection<String> c = new ArrayList<>();
        
        // Adding elements to the collection
        c.add("Apple");
        c.add("Banana");
        c.add("Orange");
        
        System.out.println("Collection: " + c);
    }
}