import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 🔥 POLYMORPHIC LIST
        ArrayList<Staff> staffList = new ArrayList<>();

        // Adding parent and child objects
        staffList.add(new Staff(1, "Aibek", 400000, 5));
        staffList.add(new Chef(2, "Murat", 600000, 12, "Kazakh"));
        staffList.add(new Waiter(3, "Dana", 300000, 4, 95));

        // POLYMORPHISM IN ACTION
        for (Staff s : staffList) {
            s.work(); // SAME method, DIFFERENT behavior
        }

        System.out.println("\n--- TYPE CHECKING ---");

        // instanceof + downcasting
        for (Staff s : staffList) {

            if (s instanceof Chef) {
                Chef chef = (Chef) s;
                chef.cookDish("Beshbarmak");

                if (chef.isMasterChef()) {
                    System.out.println("Master Chef 👨‍🍳");
                }

            } else if (s instanceof Waiter) {
                Waiter waiter = (Waiter) s;
                waiter.serveTable(5);

                if (waiter.isTopWaiter()) {
                    System.out.println("Top Waiter ⭐");
                }
            }
        }
    }
}

