public class Main {
    public static void main(String[] args) {

        Staff staff = new Staff("Aibek");
        Chef chef = new Chef("Murat");
        Waiter waiter = new Waiter("Dana");

        staff.work();
        chef.work();
        waiter.work();

        System.out.println("Master Chef!");
    }
}
