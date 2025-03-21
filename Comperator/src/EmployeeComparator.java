import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    private SeleceParameterForSort parameter;

    public EmployeeComparator(SeleceParameterForSort parameter) {
        this.parameter = parameter;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return switch (parameter) {
            case ID -> Integer.compare(o1.getId(), o2.getId());
            case NAME -> o1.getName().compareTo(o2.getName());
            case SALARY -> Double.compare(o1.getSalary(), o2.getSalary());
        };
    }
}