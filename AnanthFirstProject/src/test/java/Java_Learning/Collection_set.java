package Java_Learning;

import java.util.HashSet;
import java.util.Set;

public class Collection_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashSet to store unique elements
        Set<String> cities = new HashSet<>();

        // Add elements to the set
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Bangalore"); // Duplicate element, won't be added

        // Display the set
        System.out.println("Cities: " + cities);

        // Remove an element
        cities.remove("Chennai");
        System.out.println("After removing Chennai: " + cities);

        // Check if a city is in the set
        System.out.println("Contains Mumbai? " + cities.contains("Mumbai"));

        // Iterate through the set
        System.out.println("Iterating through the set:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Get the size of the set
        System.out.println("Size of the set: " + cities.size());
    }

	}

//Set: Duplicate value will not allow
//     Hashset: order will be change
//     Tree set: Alphabetical will execute
//     Linkedhashset: same order will execute