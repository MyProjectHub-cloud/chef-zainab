public class Staff {

    // 🔐 Encapsulation
    protected int staffId;
    protected String name;
    protected double salary;
    protected int experienceYears;

    // Constructor uses setters (VALIDATION!)
    public Staff(int staffId, String name, double salary, int experienceYears) {
        setStaffId(staffId);
        setName(name);
        setSalary(salary);
        setExperienceYears(experienceYears);
    }

    // Getters
    public int getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    // Setters with validation
    public void setStaffId(int staffId) {
        if (staffId > 0) {
            this.staffId = staffId;
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears >= 0) {
            this.experienceYears = experienceYears;
        }
    }

    // Method to be overridden
    public void work() {
        System.out.println(name + " is working.");
    }

    // Method to be overridden
    public String getRole() {
        return "Staff Member";
    }

    // NOT overridden (teacher question!)
    public boolean isExperienced() {
        return experienceYears >= 5;
    }

    @Override
    public String toString() {
        return "[" + getRole() + "] " + name +
                " | ID: " + staffId +
                " | Salary: " + salary +
                " | Experience: " + experienceYears + " years";
    }
}

