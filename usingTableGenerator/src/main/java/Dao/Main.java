package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Entites.Employee;
import Persistence.ManageFactory;

public class Main {

    public static void main(String[] args) {

        SessionFactory factory = ManageFactory.getSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        Employee employee = new Employee(1);
        session.save(employee);

        session.getTransaction().commit();
        session.close();
        factory.close();
    }

}
