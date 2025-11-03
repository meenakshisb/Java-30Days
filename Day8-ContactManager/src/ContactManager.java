import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addContact() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        contacts.add(new Contact(name, phone, email));
        System.out.println("✅ Contact added successfully!\n");
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.\n");
            return;
        }
        System.out.println("📒 Contact List:");
        for (Contact c : contacts) {
            System.out.println("--------------------");
            System.out.println(c);
        }
        System.out.println("--------------------\n");
    }

    public void searchContact() {
        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine().toLowerCase();
        boolean found = false;

        for (Contact c : contacts) {
            if (c.getName().toLowerCase().contains(searchName)) {
                System.out.println("✅ Found:\n" + c + "\n");
                found = true;
            }
        }
        if (!found) System.out.println("❌ Contact not found.\n");
    }

    public void deleteContact() {
        System.out.print("Enter name to delete: ");
        String nameToDelete = sc.nextLine().toLowerCase();

        for (Contact c : contacts) {
            if (c.getName().toLowerCase().equals(nameToDelete)) {
                contacts.remove(c);
                System.out.println("🗑️ Contact deleted!\n");
                return;
            }
        }
        System.out.println("❌ Contact not found.\n");
    }

    public void menu() {
        while (true) {
            System.out.println("====== Contact Manager ======");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1": addContact(); break;
                case "2": viewContacts(); break;
                case "3": searchContact(); break;
                case "4": deleteContact(); break;
                case "5": System.out.println("👋 Goodbye!"); return;
                default: System.out.println("Invalid choice.\n");
            }
        }
    }
}
