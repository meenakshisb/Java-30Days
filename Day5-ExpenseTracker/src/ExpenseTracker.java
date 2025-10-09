import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String category;
    double amount;
    String note;

    Expense(String category, double amount, String note) {
        this.category = category;
        this.amount = amount;
        this.note = note;
    }

    @Override
    public String toString() {
        return String.format("%-10s | ₹%-8.2f | %s", category, amount, note);
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Expense Tracker ===");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Total Spent");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter category (Food, Travel, etc): ");
                    String category = sc.nextLine();

                    System.out.print("Enter amount: ₹");
                    double amount = sc.nextDouble();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter note (optional): ");
                    String note = sc.nextLine();

                    expenses.add(new Expense(category, amount, note));
                    System.out.println("Expense added successfully!");
                    break;

                case 2:
                    if (expenses.isEmpty()) {
                        System.out.println("No expenses recorded yet.");
                    } else {
                        System.out.println("\n--- All Expenses ---");
                        System.out.printf("%-10s | %-8s | %s\n", "Category", "Amount", "Note");
                        System.out.println("--------------------------------------");
                        for (Expense e : expenses) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 3:
                    double total = 0;
                    for (Expense e : expenses) total += e.amount;
                    System.out.printf("Total spent: ₹%.2f\n", total);
                    break;

                case 4:
                    System.out.println("Exiting... Have a great day!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}