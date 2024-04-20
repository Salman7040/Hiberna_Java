package org.example;

import javax.persistence.Embeddable;

@Embeddable
public class Cirtificate {
    private String courseName;
    private String courseDuration;

    public Cirtificate(String courseName, String courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }

    public Cirtificate() {

    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration=courseDuration;
    }

    public void setCourseName(String courseName) {
        this.courseName=courseName;
    }

    @Override
    public String toString() {
        return "courseName: " + courseName + "courseDuration: " + courseDuration;
    }
}
