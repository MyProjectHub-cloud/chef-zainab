public class Chef extends Staff {

    private String specialization;

    public Chef(int staffId, String name, double salary, int experienceYears, String specialization) {
        super(staffId, name, salary, experienceYears); // super MUST be first
        setSpecialization(specialization);
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (specialization != null && !specialization.isEmpty()) {
            this.specialization = specialization;
        }
    }

    // Method overriding
    @Override
    public void work() {
        System.out.println("Chef " + name + " is cooking " + specialization + " dishes.");
    }

    @Override
    public String getRole() {
        return "Chef";
    }

    // Child-specific methods
    public void cookDish(String dish) {
        System.out.println("Chef " + name + " prepares " + dish);
    }

    public boolean isMasterChef() {
        return experienceYears >= 10;
    }

    @Override
    public String toString() {
        return super.toString() + " | Specialization: " + specialization;
    }
}

