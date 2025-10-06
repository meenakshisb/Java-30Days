import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter Operator (+, -, *, /)");
		char operator = scanner.next().charAt(0);
		
		System.out.println("Enter Second Number");
		double num2 = scanner.nextDouble();
		
		double result = 0;
		
		switch(operator) {
		
		case '+': 
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			if (result != 0) 
			{
			result = num1 / num2;
			}
			else {
				System.out.println("Error: Division by zero!");
				return;
			}
			break;
			default:
				System.out.println("Invalid operator!");
				return;
		}
		
		System.out.println("Result: " + result );

	}

}
