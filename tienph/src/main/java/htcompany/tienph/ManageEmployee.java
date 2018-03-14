package htcompany.tienph;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import htcompany.tienph.entity.Employee;

public class ManageEmployee {
	private static SessionFactory factory1;
	private static SessionFactory factory2;
	private static Session session;
	private static Transaction transaction;

	public static void main(String[] args) {

		factory1 = new Configuration().configure().buildSessionFactory();

		Employee employee = new Employee("Tien", "Pham Hoang", 20);
		addAnEmployee(employee);

		factory2 = new Configuration().configure("hibernate.SqlServer.cfg.xml").buildSessionFactory();
		addAnEmployeeForFactory2(employee);
	}

	public static int addAnEmployee(Employee employee) {
		int employeeId = 0;

		session = factory1.openSession();

		try {
			transaction = session.beginTransaction();
			employeeId = (Integer) session.save(employee);
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employeeId;
	}

	public static int addAnEmployeeForFactory2(Employee employee) {
		int employeeId = 0;

		session = factory1.openSession();

		try {
			transaction = session.beginTransaction();
			employeeId = (Integer) session.save(employee);
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return employeeId;
	}
}
