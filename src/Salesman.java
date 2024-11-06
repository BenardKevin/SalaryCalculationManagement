public class Salesman extends Employee {

    public static final int FIXED_BONUS = 400;
    public static final double SALES_RATE = .2;

    public Salesman(String firstName, String lastName, int age, String entryYear, int hoursWorked) {
        super(firstName, lastName, age, entryYear, hoursWorked);
    }

    @Override
    public int calculateSalary() {
        return (int) (hoursWorked * SALES_RATE + FIXED_BONUS);
    }
}
