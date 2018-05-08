package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entities.Phone;
import entities.PhoneDetail;
import persistence.ManageSessionFactory;

public class StorePhone {
    public static void main(String[] args) {

        PhoneDetail phoneDetail = new PhoneDetail("Cao Phong", 123);
        Phone phone = new Phone("IP6+", phoneDetail);

        SessionFactory factory = ManageSessionFactory.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(phone);

        tx.commit();
        session.close();
        factory.close();

    }
}
