import java.util.Scanner;

public class TemperatureUnitConverter {
	
	//This method converts celsius to fahrenheit
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9 / 5) + 32;
	}
	
	//This method converts fahrenheit to celsius
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * 5/9;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean keepRunning = true;
		
		System.out.println("=== Temperature Unit converter ===");
		
		while(keepRunning) {
			System.out.println("\nChoose conversion type: ");
			System.out.println("1.Celsius to Fahrenheit");
			System.out.println("2.Fahrenheit to celsius");
			System.out.println("3.Exit");
			System.out.println("Enter choice");
			
			String choice = scanner.nextLine();
			
			switch(choice) {
			
			case "1":
				System.out.println("Enter temperature in celsius :");
				double celsius = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Temperature in Fahrenheit : " + celsiusToFahrenheit(celsius));
				break;
					
			case "2":
				System.out.println("Enter temperature in Fahrenheit :");
				double fahrenheit = scanner.nextDouble();
				System.out.println("Temperature in Celsius : " + fahrenheitToCelsius(fahrenheit));
			    break;
			    
			case "3":
				keepRunning = false;
				System.out.println("Exciting Converter. Goodbye!");
				break;
				
			default:
				System.out.println("Invalid choice. Please select 1, 2, or 3.");
			
			}
		}
		
		scanner.close();
	}

}
