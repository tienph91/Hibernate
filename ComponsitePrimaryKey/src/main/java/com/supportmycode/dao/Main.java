package com.supportmycode.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.supportmycode.model.Employee;
import com.supportmycode.model.EmployeeKey;
import com.supportmycode.persistence.HibernateUtil;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        EmployeeKey empKey = new EmployeeKey(2, "AmEx");
        Employee emp1 = new Employee(empKey, "Nina", "Mayers", "222");

        session.saveOrUpdate(emp1);
        session.getTransaction().commit();
        session.close();

        sf.close();
    }
}
