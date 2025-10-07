import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("==== Student Grade Calculator ====");
		System.out.println("Enter number of Subjects: ");
		int subjects = scanner.nextInt();
		
		int[] marks = new int[subjects];
		int total = 0;
		
		//Getting mark input
		for(int i=0; i<subjects; i++) {
			System.out.println("Enter marks for Subject " + (i+1) + " (Out of 100) :");
			int mark = scanner.nextInt();
			
			//Basic validation
			
			while( mark < 0 || mark > 100) {
				System.out.println("Invalid marks! Please enter between 0 and 100 : ");
				mark = scanner.nextInt();
			}
			
			marks[i] = mark;
			total = total + mark;
			
		}
		
		double average = total / (double) subjects;
		double percentage = (total / (subjects * 100.0)) * 100;
		char grade;
		
		//Grade calculation
		
		if(percentage >= 90) grade = 'A';
		else if (percentage >= 75) grade = 'B';
		else if (percentage >= 60) grade = 'C';
		else if (percentage >= 40) grade = 'D';
		else grade = 'F';
		
		//Results
		
		System.out.println("\n==== RESULTS ====");
		System.out.println("Total Marks: " + total);
		System.out.printf("Average Marks: %.2f%%\n", average);
		System.out.printf("percentage : %.2f%%\n", percentage);
		System.out.println("Grade: " + grade);
		
		if(grade == 'F') {
			System.out.println("Status : Failed");
		}
		else {
			System.out.println("Status : Passed");
		}
		
		scanner.close();

	}

}
