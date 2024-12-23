package Java_Learning;

import java.util.ArrayList;

public class Collection_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList to store a collection of strings
        ArrayList<String> fruits = new ArrayList<>();
////lIST : dUPLICATE WILL ALLOW
//        IT WILL MAINTAIN ORDER
        
        // Add elements to the collection
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple");
        fruits.add("Date");

        // Display the collection
        System.out.println("Fruits List: " + fruits);

        // Access an element by index
        System.out.println("First Fruit: " + fruits.get(0));

        // Remove an element by value
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Iterate through the collection using a for-each loop
        System.out.println("Iterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if the collection contains an element
        System.out.println("Contains Cherry? " + fruits.contains("Cherry"));

        // Get the size of the collection
        System.out.println("Size of the list: " + fruits.size());
    }

	}


