package htcompany.annotation;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import htcompany.annotation.entity.Course;
import htcompany.annotation.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	private static SessionFactory sessionFactory;

	public static void main(String[] args) {
		sessionFactory = new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			Course course = new Course();
			course.setCourseName("YYY");
			

			Student student = new Student();
			student.setStudentName("TienPH");
			student.setCourse(course);

			session.save(student);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
