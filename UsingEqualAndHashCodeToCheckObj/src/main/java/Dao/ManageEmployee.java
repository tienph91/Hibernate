package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import Entities.Employee;

public class ManageEmployee {
    public static void main(String[] args) {

        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Employee employee1 = (Employee) session.get(Employee.class, 1);
        tx.commit();
        session.close();
        session = factory.openSession();

        tx = session.beginTransaction();
        Employee employee2 = (Employee) session.get(Employee.class, 2);

        if (employee1 == employee2) {
            System.out.println("==");
        } else {
            System.out.println("!!!!==");
        }

        if (employee1.equals(employee2)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
