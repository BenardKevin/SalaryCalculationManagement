public class Representant extends Employee {

    public static final int FIXED_BONUS = 800;
    public static final double SALES_RATE = .2;

    public Representant(String firstName, String lastName, int age, String entryYear, int hoursWorked) {
        super(firstName, lastName, age, entryYear, hoursWorked);
    }

    @Override
    public int calculateSalary() {
        return (int) (hoursWorked * SALES_RATE + FIXED_BONUS);
    }
}
