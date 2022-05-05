package oop.labor05;

import oop.labor05.models.Course;
import oop.labor05.models.MyDate;
import oop.labor05.models.Student;
import oop.labor05.models.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readCourses("courses.csv");
        for (Course course:
             courses) {
            System.out.println(course);
        }
        System.out.println();

        ArrayList<Student> students = readStudents("students.csv");
        for (Student student :
                students) {
            System.out.println(student);
        }
        System.out.println();


        ArrayList<Student> students1= new ArrayList<>();
        ArrayList<Training> trainings = new ArrayList<>();
        MyDate startDate = new MyDate(2022, 3, 21);
        MyDate endDate = new MyDate(2022, 3, 25);

        for (Course course :
                courses) {
            int i=0;
            double price=Math.random()*1001+1000;
            Training training= new Training(course,startDate,endDate,price,students1);
            while (i<10)
            {
                    int rand = (int)(Math.random() * students.size());
                    Student student = students.get(rand);
                    System.out.println(student);
                    training.enroll(student);
                    i++;
            }
            System.out.println();
            trainings.add(training);
        }
        for (Training training1:
             trainings) {
            System.out.println(training1);
        }
    }


    private static ArrayList<Course> readCourses(String filename) {
        ArrayList<Course> aux = new ArrayList();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                data[0] = data[0].trim();
                data[1] = data[1].trim();
                data[2] = data[2].trim();
                aux.add(new Course(data[0], data[1], Integer.parseInt(data[2])));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return aux;
    }

    private static ArrayList<Student> readStudents(String filename) {
        ArrayList<Student> aux = new ArrayList();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;
                String[] data = line.split(",");
                data[0] = data[0].trim();
                data[1] = data[1].trim();
                data[2] = data[2].trim();
                aux.add(new Student(data[0], data[1], data[2]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return aux;
    }
}
