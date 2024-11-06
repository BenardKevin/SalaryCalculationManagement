import java.util.ArrayList;
import java.util.List;

public class Staff {
    private final List<Employee> employeeList;

    public Staff() {
        employeeList = new ArrayList<>();
    }

    public void add(Employee employee) {
        employeeList.add(employee);
    }

    public void displaySalaries() {
        System.out.println("Liste des salaires des employés :");
        for (Employee employee : employeeList) System.out.printf("L'employé %s a un salaire de %d €\n", employee.getFullName(), employee.calculateSalary());

    }

    public void displayAverageSalary() {
        int totalSalary = 0;
        for (Employee employee : employeeList) totalSalary += employee.calculateSalary();

        int averageSalary = totalSalary / employeeList.size();
        System.out.printf("\nValeur du salaire moyen : %d €\n", averageSalary);
    }

}
