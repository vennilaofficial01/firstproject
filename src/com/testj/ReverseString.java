package com.testj;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
                                                    // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
    	
                                                    // Prompt the user to enter a string
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

                                                  // Reverse the string
       
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

                                                    // Display the reversed string
        System.out.println("Reversed string: " + reversed);

                                                   // Close the scanner
       scanner.close();
    }


public void methodqa() {
	System.out.println("qa branch2");
}
public void methodqa2() {
	System.out.println("qa2 branch2");
}
}