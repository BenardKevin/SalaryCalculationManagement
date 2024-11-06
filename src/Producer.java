public class Producer extends Employee {

    public static final int FIXED_RATE = 5;

    public Producer(String firstName, String lastName, int age, String entryYear, int hoursWorked) {
        super(firstName, lastName, age, entryYear, hoursWorked);
    }

    @Override
    public int calculateSalary() {
        return hoursWorked * FIXED_RATE;
    }
}
