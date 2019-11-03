package io.turntabl.main;

import java.util.LinkedList;
import java.util.List;

public class BagOfStudents {
    private List<Student> students = new LinkedList<>();

    public void add(Student student){
        this.students.add(student);
    }

    public void remove(Student student) {
        this.students.remove(student);
    }

    public void clear() {
        this.students.clear();
    }

}
