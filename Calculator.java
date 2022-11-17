package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	
		double num1, num2;// stores two numbers
		Scanner sc = new Scanner(System.in); // Takes input from the user
				System.out.println("Enter the numbers");
				try {//exception handling
				num1 = sc.nextDouble();// takes the inputs
				num2 = sc.nextDouble();
				
				
				
				System.out.println("Enter the operator (+,-,*,/)");
				char op = sc.next().charAt(0);
				double v = 0;
				switch (op) 
				{
				case '+':// case to add two numbers
					v = num1 + num2;
				break;
				case '-':// case to subtract two numbers
					v = num1 - num2;
				break;
				case '*':// case to multiply two numbers
					v = num1 * num2;
					break;
					case '/':// case to divide two numbers
					v = num1 / num2;
					break;
					default:
						System.out.println("You enter wrong input");
						break;
				}
				
	
				System.out.println("The final result:");
				System.out.println(num1 + " " + op + " " + num2+ " = " + v);// print the final result
	
			}
catch(InputMismatchException | ArithmeticException e) {
	System.out.println(e);
}
}
}


