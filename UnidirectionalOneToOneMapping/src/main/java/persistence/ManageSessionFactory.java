package persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ManageSessionFactory {
    public static SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

        return sessionFactory;
    }
    
    public static void main(String[] args) {
        getSessionFactory();
    }
}
