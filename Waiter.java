public class Waiter extends Staff {

    public Waiter(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Waiter " + name + " is serving tables.");
    }
}
