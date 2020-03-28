package in.codelearn.common;

import in.codelearn.model.Employee;
import in.codelearn.model.Meeting;
import in.codelearn.persistence.HibernateUtil;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        Criteria crit = session.createCriteria(Employee.class);

        @SuppressWarnings("unchecked")
        List<Employee> employees = crit.list();

        for (Employee employee : employees) {
            Set<Meeting> set = employee.getMeetings();
            System.out.println(set.size());
        }

        session.getTransaction().commit();
        session.close();
    }
}