import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice", 50000));
        employees.add(new Employee(1, "Bob", 70000));
        employees.add(new Employee(2, "Charlie", 60000));

        System.out.println("Before Sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
//        Collections.sort(employees, new SortWitID());
//        Collections.sort(employees, new SortWithName());
//        Collections.sort(employees, new SortWithSalary());


//        parameter.value
        Collections.sort(employees, new EmployeeComparator(SeleceParameterForSort.NAME));


        System.out.println("\nAfter Sorting by ID:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}