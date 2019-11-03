package io.turntabl.test;

import io.turntabl.main.Lecture;
import io.turntabl.main.Level;
import io.turntabl.main.NaughtyStudent;
import io.turntabl.main.Student;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade() {
        Student levelOneStudents = new Student(Arrays.asList(5.0, 3.0, 4.0), "Siri", Level.Second);
        assertEquals(4.0, levelOneStudents.getAverageGrade());
    }


    @Test
    void getAverageTwo(){
        Student levelTwoStudents = new Student(Arrays.asList(55.0, 83.0, 60.0), "Emma", Level.Fourth);
        assertEquals(66.0, levelTwoStudents.getAverageGrade());
    }

    @Test
    void getNaughtyStudentAverage(){
        NaughtyStudent naughtyStudent = new NaughtyStudent(Arrays.asList(10.0, 10.0, 10.0), "Balon", Level.Third);
        assertEquals(11.0, naughtyStudent.getAverageGrade());
    }

    @Test
    void getHighestAverageGrade(){
        Lecture lecOne = new Lecture();
        lecOne.Enter(new Student(Arrays.asList(10.0, 80.0, 60.0), "Shadrack", Level.First));
        Lecture lecTwo = new Lecture();
        lecTwo.Enter(new Student(Arrays.asList(20.0, 30.0, 20.0), "Isaac", Level.Third));
        Lecture lecThree = new Lecture();
        lecThree.Enter(new Student(Arrays.asList(10.0, 10.0, 10.0), "Balon", Level.Third));

        Lecture l = new Lecture();
        assertEquals(150.0, l.getHighestStudentGrade());
    }

    @Test
    void getStudentName(){
        Student s = new Student(Arrays.asList(10.0, 80.0, 60.0), "Shadrack", Level.First);
        assertEquals("Shadrack", s.getName());
    }

    @Test
    void getStudentLevel(){
        Student s = new Student(Arrays.asList(10.0, 80.0, 60.0), "Shadrack", Level.First);
        assertEquals(Level.First, s.getLevel());
    }

    @Test
    void getGrades(){
        NaughtyStudent s1 = new NaughtyStudent(Arrays.asList(20.0, 30.0, 20.0), "Isaac", Level.Third);
        assertEquals(Arrays.asList(20.0, 30.0, 20.0), s1.getGrades());
    }

}