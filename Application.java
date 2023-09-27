import java.util.Stack;
import java.util.Scanner;
 
/**
 * 
 * @author shand
 *
 */

public class Application
{
	/**
	 * 
	 * Here we will run our scanner to prompt the user to input a phrase,
	 * we will then save the input into a string. We will then push
	 * each character from the string onto the stack using a for loop.
	 * Then, we will pop each of the elements from the stack and save them into
	 * a new string which will give us a string in the reverse order as the string
	 * that was originally inputed. We will then check to see if the two strings are 
	 * equal. Depending on the result, we will then tell the user if it's a palindrome
	 * or not.
	 * 
	 */
    public static void main(String[] args)
    {

    	System.out.print("Please enter a phrase to check if it's a palindrome: ");//Prompt for the user
        Scanner scan = new Scanner(System.in);//Scanner object
        String myString = scan.nextLine();//Scanner next line inputed from the user
        Stack<Character> stack = new Stack<Character>();//Instantiation of a stack of the character type

        for (int i = 0; i < myString.length(); i++) //For loop to push the characters onto the stack
        {
            stack.push(myString.charAt(i));
        }

        String reverseString = "";//String for the reverse of the inputed string

        while (!stack.isEmpty())//While loop to pop the elements from the stack into a string while the stack is not empty
        {
            reverseString = reverseString+stack.pop();
        }

        if (myString.equals(reverseString))//If statement to tell the user if their phrase is a palindrome or not
            System.out.println("Your phrase is a palindrome.");
        else
            System.out.println("Your phrase is not a palindrome.");
        
        scan.close();//closing the scanner for memory

    }
}