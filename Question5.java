package Task15;

import java.util.ArrayList;

public class Question5 {
	
		//Creating the ArrayList method within the method as Student
		public static void student() {
			ArrayList<String> studentnames = new ArrayList<String>();
			studentnames.add(0, "Abi");
			studentnames.add(1, "Bala");
			studentnames.add(2, "Christopher");
			studentnames.add(3, "Deva");
			
			System.out.println("No of student in the list are:" +studentnames.size());
			System.out.println("No of student names are:" +studentnames);
			
			//removing all the student names from the list;
			System.out.println("Remove all the student names from the list:" +studentnames.removeAll(studentnames));
			System.out.println("No of student in the list are:" +studentnames.size());	
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			student();
	}
}
