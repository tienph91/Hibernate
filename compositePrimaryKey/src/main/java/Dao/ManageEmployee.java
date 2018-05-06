package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Entities.Employee;
import Entities.EmployeeKey;
import Utils.ManageSessionFactory;

public class ManageEmployee {

    public static void main(String[] args) {

        ManageEmployee manageEmployee = new ManageEmployee();

        EmployeeKey employeeKey = new EmployeeKey(3, "No.1");
        Employee employee = new Employee(employeeKey, "De2tte");

        manageEmployee.insertEmployee(employee);
    }

    public void insertEmployee(Employee employee) {

        SessionFactory sessionFactory = ManageSessionFactory.getSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(employee);

        session.getTransaction().commit();
        session.close();

    }
}
