package oop.labor05.models;

import oop.date.Datum;

import java.util.ArrayList;

public class Training {

    private final Course course;
    private final Datum startDate;
    private final Datum endDate;
    private final double pricePerStudent;
    private ArrayList<Student> enrolledStudents;


    public Training(Course course, Datum startDate, Datum endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
        this.enrolledStudents=new ArrayList<>();

    }

    public boolean enroll(Student student){
        if(enrolledStudents.contains(student))
        {
            enrolledStudents.add(student);
            return true;
        }
        else return false;
    }

    public Student findStudentById(String ID){
        for (Student enrolledStudent : enrolledStudents) {
            if (enrolledStudent.getID().equals(ID)) {
                return enrolledStudent;
            }
        }
       return null;
    }




    public Course getCourse() {
        return this.course;
    }
    public int numEnrolled(){
        return enrolledStudents.size();
    }
    public void unEnroll(String ID) {
        for (int i = 0; i <= enrolledStudents.size(); ++i) {
            if (enrolledStudents.get(i).getID().equals(ID)) {
                enrolledStudents.remove(i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                '}';
    }
}
