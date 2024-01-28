package factory;

import employee.Employee;
import employee.Programmer;

public class EmployeeFactory {

    //protected int number;
    public EmployeeFactory() {
    }

    public Employee getEmployee(String name, String function){
        //number++;
        return new Employee(name, function);
    }
}
