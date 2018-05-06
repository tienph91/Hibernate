package Entities;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

public class EmployeeGenerator implements IdentifierGenerator {

    public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
        String index = "Emp" + 1;

        return index;
    }

}
