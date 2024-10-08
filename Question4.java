package Task15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {

	 public static void readFile(String filePath) throws FileNotFoundException {
	        File file = new File(filePath);
	        
	        if (!file.exists()) {
	            throw new FileNotFoundException("File not found: " + filePath);
	        }
	      
	        try (Scanner fileScanner = new Scanner(file)) {
	            while (fileScanner.hasNextLine()) {
	                String line = fileScanner.nextLine();
	                System.out.println(line);
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("Error reading the file: " + e.getMessage());
	        }
	    }
	 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the file path: ");
	        String filePath = scanner.nextLine();
	        
	        try {
	            readFile(filePath);
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: File not found.");
	        }
	        
	        scanner.close();
	    }
	    
	   
}
