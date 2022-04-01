package hibernate_one_to_many_uni;


import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestMain1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();


//            Department t1 = new Department("SALES", 400, 1000);
//            Employee emp1 = new Employee("Oleg", "Ivanov", 600);
//            Employee emp2 = new Employee("Kost", "Sidorov", 900);

//            t1.addEmployeeToDepartment(emp1);
//            t1.addEmployeeToDepartment(emp2);
            session.beginTransaction();
            Department t1 = session.get(Department.class, 1);
            session.delete(t1);
//            session.save(t1);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
