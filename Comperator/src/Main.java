import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    enum SelectAttributeForSort {
        ID, NAME, SALARY
    }

    public static Comparator<Employee> getComparatorForSort(SelectAttributeForSort p) {
        switch (p){
            case ID: return new SortWitID();
            case NAME: return new SortWithName();
            case SALARY: return new SortWithSalary();
        }

        return new SortWitID();
    }

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


        SelectAttributeForSort parameter = SelectAttributeForSort.SALARY;
//        parameter.value
        Collections.sort(employees, getComparatorForSort(parameter));


        System.out.println("\nAfter Sorting by ID:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}