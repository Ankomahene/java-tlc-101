package io.turntabl.main;

public class StudentNotFoundException extends Exception {
    @Override
    public String getMessage() {
        return "StudentNotFoundException thrown";
    }

    @Override
    public void printStackTrace() {
        System.err.println("StudentNotFoundException");
    }
}
