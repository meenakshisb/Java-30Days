import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    private static ArrayList<String> tasks = new ArrayList<String>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        System.out.println("Welcome to Your To-Do List App!");
        System.out.println("----------------------------------");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove a Task");
            System.out.println("4. Mark Task as Completed");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    removeTask();
                    break;
                case 4:
                    markTaskCompleted();
                    break;
                case 5:
                    System.out.println("\nExiting... Have a productive day!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter new task: ");
        String task = sc.nextLine().trim();
        if (task.isEmpty()) {
            System.out.println("Task cannot be empty!");
        } else {
            tasks.add(task);
            System.out.println("Task added successfully!");
        }
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks added yet!");
        } else {
            System.out.println("\nYour Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void removeTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to remove!");
            return;
        }

        viewTasks();
        System.out.print("Enter task number to remove: ");
        int num = sc.nextInt();
        sc.nextLine();

        if (num <= 0 || num > tasks.size()) {
            System.out.println("Invalid task number!");
        } else {
            String removed = tasks.remove(num - 1);
            System.out.println("Removed: " + removed);
        }
    }

    private static void markTaskCompleted() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to mark as done!");
            return;
        }

        viewTasks();
        System.out.print("Enter task number to mark completed: ");
        int num = sc.nextInt();
        sc.nextLine();

        if (num <= 0 || num > tasks.size()) {
            System.out.println("Invalid task number!");
        } else {
            String task = tasks.get(num - 1);
            tasks.set(num - 1, "[Completed] " + task);
            System.out.println("Task marked as completed!");
        }
    }
}
