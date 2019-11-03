package io.turntabl.main;

import java.util.LinkedList;
import java.util.List;

public class BagOfLecturers {
    private List<Lecture> lectures = new LinkedList<>();

    public void add(Lecture lecture) {
        this.lectures.add(lecture);
    }

    public void remove(Lecture lecture){
        this.lectures.remove(lecture);
    }

    public void clear(){
        this.lectures.clear();
    }

}