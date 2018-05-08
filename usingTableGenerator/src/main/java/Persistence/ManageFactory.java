package Persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ManageFactory {
    public static SessionFactory getSessionFactory() {

        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        return factory;
    }
}
