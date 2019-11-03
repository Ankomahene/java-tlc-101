package io.turntabl.main;

import java.util.List;

public class NaughtyStudent extends Student{

    public NaughtyStudent(List<Double> grades, String name, Level level) {
        super(grades, name, level);
    }

    @Override
    public Double getAverageGrade(){
        return super.getAverageGrade()  + ((10.0/100.0)*super.getAverageGrade());
    }
}
