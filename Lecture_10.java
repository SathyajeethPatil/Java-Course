package Lecture;

import java.util.Scanner;

public class Lecture_10 {

	public static void main(String[] args) {
		/* Switch Statement
		 Variable types supported by switch statement are: 
		 char, byte, short, int and Strings.*/
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Instructions");
		String text = input.nextLine();
		
		switch (text) {
		case "run":
			System.out.println("Program is Running");
			break;
		case "stop":
			System.out.println("Program is Stopped");
			break;
		default:
			System.out.println("Instruction Not Recognised");
		}
	}

}
