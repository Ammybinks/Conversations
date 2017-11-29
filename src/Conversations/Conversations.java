package Conversations;

import java.util.Scanner;

public class Conversations {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String name;
		String noun;
		String verb;
		
		int integer = 1;
		
		double decimal = 6.34;
		
		System.out.println("Please enter:");
		
		System.out.print("Your name:");
		name = input.nextLine();
		System.out.print("A noun:");
		noun = input.next();
		input.nextLine();
		System.out.print("A verb:");
		verb = input.next();
		input.nextLine();
		System.out.print("A number:");
		if (input.hasNextInt())
		{
			integer = input.nextInt();
			input.nextLine();
		}
		System.out.print("And a real number:");
		if (input.hasNextDouble())
		{
			decimal = input.nextDouble();
			input.nextLine();
		}
		
		String story = "One day, a young hero named " + noun + "- or wait, what were they called again?\nOh well, they weilded a " + verb + " and a " + name + " as their weapons of choice, and they slew more than " + decimal + " evil monsters!\nAlong with their sidekick " + integer + ", they saved the land from evil incarnate! Yay!";
		
		System.out.println(story);
	}

}
