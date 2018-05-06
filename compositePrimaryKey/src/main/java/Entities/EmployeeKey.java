package Entities;

import java.io.Serializable;

import javax.persistence.Column;

public class EmployeeKey {

    /**
     * 
     */

    @Column(name = "EmployeeId")
    private int employeeId;

    @Column(name = "EmployeeNo")
    private String employeNo;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeNo() {
        return employeNo;
    }

    public void setEmployeNo(String employeNo) {
        this.employeNo = employeNo;
    }

    public EmployeeKey(int employeeId, String employeNo) {
        super();
        this.employeeId = employeeId;
        this.employeNo = employeNo;
    }

    public EmployeeKey() {
        super();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((employeNo == null) ? 0 : employeNo.hashCode());
        result = prime * result + employeeId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EmployeeKey other = (EmployeeKey) obj;
        if (employeNo == null) {
            if (other.employeNo != null)
                return false;
        } else if (!employeNo.equals(other.employeNo))
            return false;
        if (employeeId != other.employeeId)
            return false;
        return true;
    }

}
