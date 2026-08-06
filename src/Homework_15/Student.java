package Homework_15;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> marks;


    public Student(String name, String group, int course, List<Integer> marks){
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = new ArrayList<>(marks);

    }

    public String getName(){return name;}
    public String getGroup(){return group;}
    public int getCourse(){return course;}
    public List<Integer> getMarks(){return marks;}

    public void setCourse(int course){this.course = course;}

    public double getAverageMark(){
        if(marks.isEmpty()){
            return 0.0;
        }
        int sum = 0;
        for(int m : marks){
            sum += m;
        }
        return (double) sum / marks.size();
    }

    @Override
    public String toString() {
        return String.format("Student{name='%s', group='%s',course=%d, avg=%.2f",
                name, group, course, getAverageMark());
    }
}
