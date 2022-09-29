
//Application:		Program 3
//Name:				Kendall Chandler
//GitHub User:		kendallchandler
//Date:				Sep 27, 2022
//Version:			1.0
//Description:		Third program practicing loops


	//import the scanner for later use
	import java.util.Scanner;



public class chandlerProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//use the scanner to ask the user for their name and a number
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = keyboard.next();
		System.out.print("Pick a number between 0 and 100: ");
		int number = keyboard.nextInt();
		
		
		//while loop that determines if the user's number is between 0 and 100
		while (number<=100)
		{
			System.out.println("Thank you for your input, " + name);
			break;
		}
		
		
		//while loop that makes the user pick a new number if it is not between 0 and 100
		while (number<0 || number>100)
		{
			System.out.print("Pick another number between 0 and 100: ");
			number = keyboard.nextInt();
			break;
		}
		
		
		
		//for loop that counts down from the user's number
		for(int count = number; count>=0; count--)
		{
			System.out.println("Your assignment is due in " + count + " minutes. Hurry!");
		}
		
		System.out.println("Too late!");
		
	}

}
