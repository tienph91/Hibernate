package Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {

    @Id
    @GenericGenerator(name = "EmployeeGenerate", strategy = "Entities.EmployeeGenerator")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeKey;

    private String name;

    private int age;

    public Employee() {
        super();
    }

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Employee(int employeeKey, String name, int age) {
        super();
        this.employeeKey = employeeKey;
        this.name = name;
        this.age = age;
    }

    public int getEmployeeKey() {
        return employeeKey;
    }

    public void setEmployeeKey(int employeeKey) {
        this.employeeKey = employeeKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
