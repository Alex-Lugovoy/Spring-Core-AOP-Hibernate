package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try{
            session = factory.getCurrentSession();
            session.beginTransaction();


//            Section section1 = new Section("Chess");
//            Section section2 = new Section("Volleyball");
//            Section section3 = new Section("Dance");
//            Child child1 = new Child(10, "Sergey");
//
//            child1.addSection(section1);
//            child1.addSection(section2);
//            child1.addSection(section3);
//            Child child2 = new Child(5, "Masha");
//            Child child3 = new Child(4, "Lesha");
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);

//            session.save(child1);

//            Section section1 = session.get(Section.class, 1);
//
//            System.out.println(section1);
//            System.out.println(section1.getChilden());

//            Child child = session.get(Child.class, 4);
//
//            System.out.println(child);
//            System.out.println(child.getSection());

//            Section section1 = session.get(Section.class, 1);
//
//            session.delete(section1);

            System.out.println("Done!");

            session.getTransaction().commit();

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
