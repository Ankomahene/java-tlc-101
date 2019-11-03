package io.turntabl.test;

import io.turntabl.main.Level;
import io.turntabl.main.NaughtyStudent;
import io.turntabl.main.Register;
import io.turntabl.main.Student;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    @Test
    void getRegister(){
        Student st = new Student(Arrays.asList(20.0, 30.0, 20.0), "Frank", Level.Third);
        Register reg = new Register(Arrays.asList(st));

        assertEquals(Arrays.asList("Frank"), reg.getRegister());
    }

    @Test
    void getRegisterMultipleStudents(){
        Student s1 = new Student(Arrays.asList(20.0, 30.0, 20.0), "Shadi", Level.Third);
        Student s2 = new Student(Arrays.asList(50.0, 20.0, 80.0), "Eva", Level.Third);
        Student s3 = new Student(Arrays.asList(10.0, 60.0, 20.0), "Francis", Level.Third);
        Student s4 = new Student(Arrays.asList(40.0, 30.0, 30.0), "Alex", Level.Third);
        Student s5 = new Student(Arrays.asList(70.0, 40.0, 10.0), "Sam", Level.Third);

        Register reg = new Register(Arrays.asList(s1, s2, s3, s4, s5));

        assertEquals(Arrays.asList("Shadi", "Eva", "Francis", "Alex" ,"Sam"), reg.getRegister());
    }

    @Test
    void getRegisterForNaughtyStudent(){
        NaughtyStudent nst = new NaughtyStudent(Arrays.asList(20.0, 30.0, 20.0), "Emma", Level.Third);
        Register reg = new Register(Arrays.asList(nst));

        assertEquals(Arrays.asList("Emma"), reg.getRegister());
    }

    @Test
    void getRegisterMultipleNaughtyStudents(){
        NaughtyStudent s1 = new NaughtyStudent(Arrays.asList(20.0, 30.0, 20.0), "Isaac", Level.Third);
        NaughtyStudent s2 = new NaughtyStudent(Arrays.asList(50.0, 20.0, 80.0), "Eva", Level.Third);
        NaughtyStudent s3 = new NaughtyStudent(Arrays.asList(10.0, 60.0, 20.0), "Francis", Level.Third);
        NaughtyStudent s4 = new NaughtyStudent(Arrays.asList(40.0, 30.0, 30.0), "Alex", Level.Third);
        NaughtyStudent s5 = new NaughtyStudent(Arrays.asList(70.0, 40.0, 10.0), "Sam", Level.Third);

        Register reg = new Register(Arrays.asList(s1, s2, s3, s4, s5));

        assertEquals(Arrays.asList("Isaac", "Eva", "Francis", "Alex" ,"Sam"), reg.getRegister());
    }

    @Test
    void getRegisterByLevel(){
        Student st1 = new Student(Arrays.asList(20.0, 30.0, 20.0), "Frank", Level.Third);
        Student st2 = new Student(Arrays.asList(20.0, 30.0, 20.0), "John", Level.Third);
        Student st3 = new Student(Arrays.asList(20.0, 30.0, 20.0), "Yaa", Level.First);
        Student st4 = new Student(Arrays.asList(20.0, 30.0, 20.0), "Cleo", Level.First);

        Register reg = new Register(Arrays.asList(st1, st2, st3, st4));

        assertEquals(Arrays.asList("Yaa", "Cleo"), reg.getRegisterByLevel(Level.First));
    }

    @Test
    void getRegisterByThirdLevel(){
        Student st1 = new Student(Arrays.asList(20.0, 30.0, 20.0), "Frank", Level.Third);
        Student st2 = new Student(Arrays.asList(20.0, 30.0, 20.0), "John", Level.Third);
        Student st3 = new Student(Arrays.asList(20.0, 30.0, 20.0), "Yaa", Level.First);
        Student st4 = new Student(Arrays.asList(20.0, 30.0, 20.0), "Cleo", Level.First);

        Register reg = new Register(Arrays.asList(st1, st2, st3, st4));

        assertNotEquals(Arrays.asList("Yaa", "Cleo"), reg.getRegisterByLevel(Level.Third));
    }

    @Test
    void PrintReport(){
        Student st1 = new Student(Arrays.asList(20.0, 30.0, 20.0), "Frank", Level.Third);
        Student st2 = new Student(Arrays.asList(20.0, 30.0, 20.0), "John", Level.Third);
        Student st3 = new Student(Arrays.asList(20.0, 30.0, 20.0), "Yaa", Level.First);
        Student st4 = new Student(Arrays.asList(20.0, 30.0, 20.0), "Cleo", Level.First);

        Register reg = new Register(Arrays.asList(st1, st2, st3, st4));

        assertEquals("Yaa, Cleo, Frank, John", reg.PrintReport());
    }

}
