abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String entryYear;
    protected int hoursWorked;

    public Employee(String firstName, String lastName, int age, String entryYear, int hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.entryYear = entryYear;
        this.hoursWorked = hoursWorked;
    }

    public abstract int calculateSalary();

    public String getFullName() {
        return firstName + " " + lastName;
    }
}