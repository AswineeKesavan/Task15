package Task15;

import java.util.TreeMap;

public class Question6 {

	public static void treeMap() {
		// Create a TreeMap to store employee IDs (Integer) and names (String)
		TreeMap<Integer, String> employeeMap = new TreeMap<Integer, String>();

		// Adding some employee data to the TreeMap
		employeeMap.put(102, "Bob");
		employeeMap.put(101, "Alice");
		employeeMap.put(104, "Diana");
		employeeMap.put(105, "Eve");
		employeeMap.put(103, "Charlie");

		// Print the names of all employees in alphabetical order
		System.out.println("Employee names in alphabetical order:");

		// Iterate through the values of the TreeMap (which are names) and print them
		for (String name : employeeMap.values()) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		treeMap();
	}
}
