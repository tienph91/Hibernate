package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Entities.Employee;
import Utils.ManageSfactory;

public class ManageEmployee {
    public static void main(String[] args) {

        Employee employee = new Employee("Tien", 27);

        SessionFactory factory = ManageSfactory.getSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        session.save(employee);
        session.getTransaction().commit();

        session.close();
    }
}
