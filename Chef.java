public class Chef extends Staff {

    public Chef(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Chef " + name + " is cooking Kazakh Cuisine dishes.");
    }
}
