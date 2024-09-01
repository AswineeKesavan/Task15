package Task15;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

	public void ListToArray() {
			// Create a List of integers
			List<Integer> list = new ArrayList<>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);

			// Convert List to Array
			Integer[] array = list.toArray(new Integer[0]);

			// Print the List
			System.out.println("List: " + list);

			// Print the Array
			System.out.print("Array: ");
			for (Integer element : array) {
				System.out.print(element + " ");
			}
		}
	public static void main(String[] args) {
		Question7 question =new Question7();
		question.ListToArray();
		
	}
}
