package AggregationExample;

import java.util.LinkedList;
import java.util.List;

public class ExampleTwo {

    public static void main(String args[]) {
        Employee Ben = new Employee(30, "Ben", 50000);
        Employee Simon = new Employee(41, "Simon", 75000);
        Employee Emily = new Employee(34, "Emily", 60000);
        Employee Jhon = new Employee(55, "Jhon", 100000);

        List<Employee> employees = new LinkedList<>();
        employees.add(Ben);
        employees.add(Simon);
        employees.add(Emily);
        employees.add(Jhon);

        HRDepartment hr = new HRDepartment(employees);
        hr.display();
    }


}

class Employee {
    private int age;
    private String name;
    private double salary;

    public Employee(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class HRDepartment {
    List<Employee> employees;

    public HRDepartment(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void display() {
        for (Employee e : employees) {
            System.out.println("Name: " + e.getName() + ", age: " + e.getAge());
            System.out.println("Salary: " + e.getSalary());
        }
    }
}
