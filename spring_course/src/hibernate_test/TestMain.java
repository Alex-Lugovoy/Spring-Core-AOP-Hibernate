package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMain {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();

            Employee tmp = new Employee("Alex", "Lugovoy", "Sber", 1000);
            session.beginTransaction();
            session.save(tmp);

            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
        }
    }
}
