package HashAndSort;
import java.util.HashMap;

// TODO Hashing in Java
// Uses an array of linked lists (buckets) and hashing function
// Default load factor is 0.75 (Rehashing occurs when 75% full)

// Handling Collisions:
// 1. Chaining (Linked List in bucket)
// 2. Open Addressing (Linear/Quadratic Probing)

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        System.out.println("Age of Alice: " + map.get("Alice"));
    }
}

