package Homework_15;

import java.util.Iterator;
import java.util.List;

public class StudentManager {
    public static void processStudent(List<Student> students){
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student s = iterator.next();
            if (s.getAverageMark() < 3.0){
                iterator.remove();
            }
            else {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

    public static void printStudent(List<Student> students, int course){
        System.out.println("Студенты на курсе - " + course + ":");
        boolean found = false;
        for (Student s : students){
            if(s.getCourse() == course){
                System.out.println(s.getName());
                found = true;
            }
        }
        if(!found){
            System.out.println("Студентов нет на курсе!");
        }
    }
}
