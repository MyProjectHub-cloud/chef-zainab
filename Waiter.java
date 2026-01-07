public class Waiter extends Staff {

    private int tablesServed;

    public Waiter(int staffId, String name, double salary, int experienceYears, int tablesServed) {
        super(staffId, name, salary, experienceYears);
        setTablesServed(tablesServed);
    }

    public int getTablesServed() {
        return tablesServed;
    }

    public void setTablesServed(int tablesServed) {
        if (tablesServed >= 0) {
            this.tablesServed = tablesServed;
        }
    }

    // Method overriding
    @Override
    public void work() {
        System.out.println("Waiter " + name + " is serving tables.");
    }

    @Override
    public String getRole() {
        return "Waiter";
    }

    // Child-specific methods
    public void serveTable(int tableNumber) {
        System.out.println("Waiter " + name + " serves table #" + tableNumber);
        tablesServed++;
    }

    public boolean isTopWaiter() {
        return tablesServed > 100 && experienceYears >= 3;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tables Served: " + tablesServed;
    }
}

