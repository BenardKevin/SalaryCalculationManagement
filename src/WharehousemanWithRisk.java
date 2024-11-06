public class WharehousemanWithRisk extends Employee {

    public static final int FIXED_BONUS = 200;
    public static final int HOURLY_RATE = 65;

    public WharehousemanWithRisk(String firstName, String lastName, int age, String entryYear, int hoursWorked) {
        super(firstName, lastName, age, entryYear, hoursWorked);
    }

    @Override
    public int calculateSalary() {
        return hoursWorked * HOURLY_RATE + FIXED_BONUS;
    }
}
