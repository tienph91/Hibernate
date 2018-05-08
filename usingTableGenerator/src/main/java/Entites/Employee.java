package Entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Employee {

    @Id
    @TableGenerator(name = "sequence_table_id", pkColumnName = "id", valueColumnName = "value", allocationSize = 1)
    @GeneratedValue(generator = "sequence_table_id", strategy = GenerationType.TABLE)
    private int employeeId;

    @Column(name = "name")
    private int name;

    public Employee() {
        super();
    }

    public Employee(int employeeId, int name) {
        super();
        this.employeeId = employeeId;
        this.name = name;
    }

    public Employee(int name) {
        super();
        this.name = name;
    }

}
