package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMain1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            Employee tmp = new Employee("Ivan", "Mokrovoi ", "VTB", 750);
            session.save(tmp);
            int id = tmp.getId();
            Employee my = session.get(Employee.class, id);

            session.getTransaction().commit();
            System.out.println(my);
        }
        finally {
            sessionFactory.close();
        }
    }
}
