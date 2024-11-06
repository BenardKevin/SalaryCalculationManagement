public class Wharehouseman extends Employee {

    public static final int HOURLY_RATE = 65;

    public Wharehouseman(String firstName, String lastName, int age, String entryYear, int hoursWorked) {
        super(firstName, lastName, age, entryYear, hoursWorked);
    }

    @Override
    public int calculateSalary() {
        return hoursWorked * HOURLY_RATE;
    }
}
