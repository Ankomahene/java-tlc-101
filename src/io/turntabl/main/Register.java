package io.turntabl.main;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Register {
    private List<Student> students;

    public Register(List<Student> students){
        this.students = students;
    }

    public List<String> getRegister(){
        List<String> studentNames = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        return studentNames;
    }

    public List<String> getRegisterByLevel(Level level){
        return this.students.stream()
                .filter(student -> student.getLevel() == level)
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public String PrintReport() {
        return  this.students.stream()
                .sorted(Comparator.comparing(Student::getLevel))
                .reduce("", (res, student) -> res + student.getName() + ", ", String::concat);
    }

    //incomplete
    public Optional<Student> getStudentByName(String name){

        for(Student s : students){
            if (s.getName() == name){
                return Optional.of(s);
            }else {
                return Optional.empty();
            }
        }

//        students.stream().filter(s -> s.getName() == name)
//                .collect(Collectors


//        return this.students.stream()
//                .filter(s -> s.getName() == name)
//                .map(Student::getName).E;

        return null;
    }

}