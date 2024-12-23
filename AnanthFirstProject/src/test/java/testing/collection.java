package testing;

import java.util.ArrayList;
import java.util.List;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an ArrayList to store integers
        List<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Displaying all elements
        System.out.println("Initial List: " + numbers);

        // Accessing elements
        int firstElement = numbers.get(0); // Get the first element
        System.out.println("First element: " + firstElement);

        // Modifying elements
        numbers.set(0, 15); // Change the second element to 25
        System.out.println("List after modification: " + numbers);

        // Removing elements
        numbers.remove(2); // Remove the third element (index 2)
        System.out.println("List after removal: " + numbers);

        // Iterating over the list using a for-each loop
        System.out.println("Iterating over the list:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Checking if the list contains a specific element
        boolean containsThirty = numbers.contains(50);
        System.out.println("List contains 50: " + containsThirty);

        // Finding the size of the list
        int size = numbers.size();
        System.out.println("Size of the list: " + size);
    }

	}


