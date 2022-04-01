package AOP;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> studentList= new ArrayList<>();

    public void addStudent(){
        Student st1 = new Student("Alex", 2, 1);
        Student st2 = new Student("Mike", 4, 21);
        Student st3 = new Student("Jack", 3, 6);
        Student st4 = new Student("Polod", 1, 52);

        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
    }

    public List<Student> getStudentList(){
        System.out.println("Начало метода getStudents");
        studentList.get(12);
        System.out.println("Information about our student : ");
        System.out.println(studentList);
        return studentList;
    }

    public String getBook(){
        System.out.println("Метод getBook()");
        return "Война и мир";
    }
}
