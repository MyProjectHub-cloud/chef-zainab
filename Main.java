import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Staff> staffList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addStaff();
                    break;
                case 2:
                    addChef();
                    break;
                case 3:
                    addWaiter();
                    break;
                case 4:
                    viewAllStaff();
                    break;
                case 5:
                    demonstratePolymorphism();
                    break;
                case 6:
                    viewChefsOnly();
                    break;
                case 7:
                    viewWaitersOnly();
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);
    }

    // ================= MENU =================
    private static void showMenu() {
        System.out.println("\n=== RESTAURANT SYSTEM ===");
        System.out.println("1. Add Staff (General)");
        System.out.println("2. Add Chef");
        System.out.println("3. Add Waiter");
        System.out.println("4. View All Staff");
        System.out.println("5. Demonstrate Polymorphism");
        System.out.println("6. View Chefs Only");
        System.out.println("7. View Waiters Only");
        System.out.println("0. Exit");
        System.out.print("Enter choice: ");
    }

    // ================= ADD STAFF =================
    private static void addStaff() {
        System.out.println("\n--- Add Staff ---");

        System.out.print("Staff ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Experience Years: ");
        int exp = scanner.nextInt();

        staffList.add(new Staff(id, name, salary, exp));
        System.out.println("Staff added successfully!");
    }

    // ================= ADD CHEF =================
    private static void addChef() {
        System.out.println("\n--- Add Chef ---");

        System.out.print("Staff ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Experience Years: ");
        int exp = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Specialization: ");
        String spec = scanner.nextLine();

        staffList.add(new Chef(id, name, salary, exp, spec));
        System.out.println("Chef added successfully!");
    }

    // ================= ADD WAITER =================
    private static void addWaiter() {
        System.out.println("\n--- Add Waiter ---");

        System.out.print("Staff ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Experience Years: ");
        int exp = scanner.nextInt();

        System.out.print("Tables Served: ");
        int tables = scanner.nextInt();

        staffList.add(new Waiter(id, name, salary, exp, tables));
        System.out.println("Waiter added successfully!");
    }

    // ================= VIEW ALL STAFF =================
    private static void viewAllStaff() {
        System.out.println("\n--- ALL STAFF ---");

        if (staffList.isEmpty()) {
            System.out.println("No staff available.");
            return;
        }

        for (Staff s : staffList) {
            System.out.println(s);
        }
    }

    // ================= POLYMORPHISM DEMO =================
    private static void demonstratePolymorphism() {
        System.out.println("\n--- POLYMORPHISM DEMO ---");

        for (Staff s : staffList) {
            s.work(); // SAME METHOD – DIFFERENT BEHAVIOR
        }
    }

    // ================= VIEW CHEFS =================
    private static void viewChefsOnly() {
        System.out.println("\n--- CHEFS ONLY ---");

        for (Staff s : staffList) {
            if (s instanceof Chef) {
                Chef c = (Chef) s;
                System.out.println(c);

                if (c.isMasterChef()) {
                    System.out.println("Master Chef 👨‍🍳");
                }
            }
        }
    }

    // ================= VIEW WAITERS =================
    private static void viewWaitersOnly() {
        System.out.println("\n--- WAITERS ONLY ---");

        for (Staff s : staffList) {
            if (s instanceof Waiter) {
                Waiter w = (Waiter) s;
                System.out.println(w);

                if (w.isTopWaiter()) {
                    System.out.println("Top Waiter ⭐");
                }
            }
        }
    }
}


