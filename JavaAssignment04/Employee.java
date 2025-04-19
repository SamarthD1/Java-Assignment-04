class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    int getId() {
        return id;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getName() {
        return firstName + " " + lastName;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    int getAnnualSalary() {
        return salary * 12;
    }

    int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        Employee e = new Employee(1, "Ram", "Raj", 5000);
        System.out.println(e);
        e.raiseSalary(10);
        System.out.println("After Raise: " + e);
    }
}
