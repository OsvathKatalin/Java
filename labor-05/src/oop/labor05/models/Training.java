package oop.labor05.models;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Training {
    private Course course;
    private MyDate startDate;
    private MyDate endDate;
    private double pricePerStudent;
    private ArrayList<Student> enrolledStudents;

    public Training(Course course,
                    MyDate startDate,
                    MyDate endDate,
                    double pricePerStudent,
                    ArrayList<Student> enrolledStudents) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
        this.enrolledStudents = enrolledStudents;
    }

    public boolean enroll(Student student) {
       // if(!findStudentById(student.getID()))
      //  {
            enrolledStudents.add(student);
           // return true;
       // }
        return false;
    }

    public boolean findStudentById(String ID) {
        for (Student student :
                enrolledStudents) {
            if (student.getID().equals(ID)) return true;
        }
        return false;
    }

    public Course getCourse() {
        return this.course;
    }

    public int numEnrolled() {
        return enrolledStudents.size();
    }

    public void printToFile() {
        String fileName = course.getName() + "_" + startDate.getEv() + "." + startDate.getHo() + "." + startDate.getNap() + ".csv";
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Student student :
                    enrolledStudents) {
                String data = String.format("%s, %s, %s\n", student.getFirstName(), student.getLastName(), student.getID());
                writer.write(data);
            }

        } catch (IOException e) {
            System.out.println("File writing error!");
        }


    }

    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }

    public void unEnroll(String ID) {
        for (Student student :
                enrolledStudents) {
            if (ID.equals(student.getID())) {
                enrolledStudents.remove(student);
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
