package io.turntabl.main;

import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Student implements Nameable, HasLevel{
    private String name;
    private Level level;
    private List<Double> grades;

    public Student(List<Double> grades, String name, Level level){
        this.grades = grades;
        this.name = name;
        this.level = level;
    }

    public Double getAverageGrade(){
        double sum = 0.0;

        for(Double grade : this.grades){
            sum += grade;
        }
        return sum/this.grades.size();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Level getLevel() {
        return this.level;
    }

    public List<Double> getGrades(){
        return grades.stream().collect(Collectors.toList());

//        DoubleStream stream = DoubleStream.of(8.2, 5.6, 4.1);
    }


}
