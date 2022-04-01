package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
            session.beginTransaction();

//            Department dep = new Department("SALES", 300, 1500);
//            Employee e1 = new Employee("Alex", "Lugov", 800);
//            Employee e2 = new Employee("Oleg", "Pokrat", 700);
//            Employee e3 = new Employee("Ivan", "Sidorov", 600);
//            Employee e4 = new Employee("Petr", "Ivanov", 1000);
//
//            dep.addEmployeeToDepartment(e1);
//            dep.addEmployeeToDepartment(e2);
//            dep.addEmployeeToDepartment(e3);
//            dep.addEmployeeToDepartment(e4);
//
//            session.save(dep);

            System.out.println("Get department");
            Department dep = session.get(Department.class, 5);

            System.out.println("Show department");
            System.out.println(dep);
            System.out.println("Show employee of the department");
            System.out.println(dep.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
