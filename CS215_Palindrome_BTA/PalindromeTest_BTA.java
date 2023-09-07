/**
 * This program gets a string input from the user, 
 * tests if the string is a palindrome and returns the result
 * @author Ben Albright
 */
import java.util.Scanner;
import java.util.Stack;
public class PalindromeTest_BTA {

	public static void main(String[] args) {
		
		/**
		 * Instantiating 2 stacks. stack holds the characters in the order they were entered.
		 * stack holds characters in the reverse order.
		 */
		Stack<Character> stack = new Stack<Character>();
		
        /**
         * Scanner is instantiated and asks user to enter a string.
         */
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a string to test if it is a palindrome.");
		
		/**
		 * Strings are instantiate forwardInput for the user input, forwardOutput how the characters output, 
		 * and reverseOutput for the reverse order of the characters.
		 */

		String forwardInput = userInput.nextLine();
		String forwardOutput = "";
		String reverseOutput = "";
		
		/**
		 * The toLowerCase() method is used so that characters can be compared 
		 * regardless of capitalization.
		 */
		forwardInput = forwardInput.toLowerCase();
		
		/**
		 * This for loop adds all characters from the user's string into a stack.
		 */
		for (int i = 0; i < forwardInput.length(); i++) 
        {
			/**
			 * This if statement checks for any non-alphabetical characters and ignores them
			 * characers a-z are added to the stack.
			 */
        	if(forwardInput.charAt(i) >= 'a' && forwardInput.charAt(i) <= 'z')
        	{
        		stack.push(forwardInput.charAt(i));
        		/**
        		 * The while loop checks if the stack is empty. 
        		 * If not, it updates the forwardOutput string until it is.
        		 */
        		while (!stack.isEmpty()) 
        		{
        	           forwardOutput = forwardOutput + stack.pop();
        		}//end while
        	}//end if
        }//end for
		
		/**
		 * Outputs the user's string without any non-alphabetical characters.
		 */
		System.out.println("The string without any non-alphabetical characters is: " + forwardOutput);
		
		/**
		 * This loop adds characters to the stack in the opposite order
		 * they were added to the stack.
		 */
		for (int i = 0; i < forwardInput.length(); i++)
		{
			if(forwardInput.charAt(i) >= 'a' && forwardInput.charAt(i) <= 'z')
        	{
        		stack.push(forwardInput.charAt(i));
        	}//end if
		}//end for
		
		/**
		 * The while loop checks if the stack is empty. 
		 * If not, it updates the reverseOutput string until it is.
		 */
		while (!stack.isEmpty()) {
            reverseOutput = reverseOutput + stack.pop();
        }//end while
		/**
		 * Outputs the reverse order of the string entered,
		 * ignoring any non-alphabetical characters.
		 */
		System.out.println("The reverse of the entered string is: " + reverseOutput);
		
		/**
		 * This if statement compares the 2 strings to see if they are equal.
		 * If they are equal, the string is a palindrom. If it's not equal, it's not a palindrome.
		 */
		if (forwardOutput.equals(reverseOutput))
            System.out.println("This is a palindrome.");
        else
            System.out.println("This is NOT a palindrome.");

		/**
		 * Closes the scanner to prevent memory leak.
		 */
		userInput.close();
	}// end main
}//end class