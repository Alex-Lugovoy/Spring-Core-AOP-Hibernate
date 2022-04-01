package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete Employee "+ "where name = 'Alex'").executeUpdate();


//            for(Employee ttt : my) {
//                ttt.setSalary(2000);
//                System.out.println(ttt);
            session.getTransaction().commit();
        }
        finally {
            sessionFactory.close();
        }
    }
}
