import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {

        /*
            HashMap
                - stores data as key -> value pairs
                - keys must be unique
                - values can be duplicate
                - no order is guaranteed (use LinkedHashMap if order needed)
                - allows ONE null key and MULTIPLE null values
                - uses hashing for fast access (avg O(1))
                - works only with reference data types (generics rule)
        */

        @SuppressWarnings("Convert2Diamond")
        HashMap<String, Integer> marks = new HashMap<String, Integer>();

        // add data (put)
        marks.put("maths", 90);
        marks.put("cs", 95);
        marks.put("english", 85);

        // overwrite value if key already exists
        marks.put("cs", 100);

        // get value using key
        System.out.println(marks.get("cs"));      // 100
        System.out.println(marks.get("biology")); // null (no error)

        // check key exists
        System.out.println(marks.containsKey("maths")); // true
        System.out.println(marks.containsKey("bio"));   // false

        // check value exists
        System.out.println(marks.containsValue(85)); // true

        // remove key
        marks.remove("english");

        // size of hashmap
        System.out.println("size is " + marks.size());

        // null key & null value
        marks.put(null, 50);
        marks.put("optional", null);

        System.out.println(marks);

        /*
            Iterating HashMap
        */

        // iterate keys only
        for (String key : marks.keySet()) {
            System.out.println("key = " + key);
        }

        // iterate values only
        for (Integer value : marks.values()) {
            System.out.println("value = " + value);
        }

        // iterate key + value (MOST IMPORTANT)
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /*
            HashMap of HashMap (like 2D ArrayList)
        */

        HashMap<String, HashMap<String, Integer>> studentMarks = new HashMap<>();

        HashMap<String, Integer> student1 = new HashMap<>();
        student1.put("maths", 90);
        student1.put("cs", 95);

        HashMap<String, Integer> student2 = new HashMap<>();
        student2.put("maths", 80);
        student2.put("cs", 85);

        studentMarks.put("Suresh", student1);
        studentMarks.put("Ravi", student2);

        // access inner map
        System.out.println(studentMarks.get("Suresh").get("cs")); // 95

        // nested iteration
        for (String student : studentMarks.keySet()) {
            System.out.println("Student: " + student);

            for (Map.Entry<String, Integer> e : studentMarks.get(student).entrySet()) {
                System.out.println("  " + e.getKey() + " = " + e.getValue());
            }
        }

        // clear everything
        marks.clear();
        System.out.println("after clear: " + marks);
    }
}
