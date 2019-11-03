package io.turntabl.main;

import java.util.*;

public class Lecture {
    private List<Student> students = new ArrayList<>();

    public void Enter(Student s){
        this.students.add(s);
    }

    public Double getHighestStudentGrade(){
        Optional<Student> highestGrade = this.students.stream()
                .max(Comparator.comparing( Student::getAverageGrade));

        return highestGrade.map(Student::getAverageGrade).orElse(0.0);
    }

}