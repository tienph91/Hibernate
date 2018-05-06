package Entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

    @Embedded
    private EmployeeKey employeeKey;

    @Id
    @Column(name = "name")
    private String name;

    public EmployeeKey getEmployeeKey() {
        return employeeKey;
    }

    public void setEmployeeKey(EmployeeKey employeeKey) {
        this.employeeKey = employeeKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(EmployeeKey employeeKey, String name) {
        super();
        this.employeeKey = employeeKey;
        this.name = name;
    }

    public Employee() {
        super();
    }

}
