package oop.labor10_2;

import oop.labor10_1.MyDate;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.FileSystemLoopException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.employees=new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employee)
    {
        employees.add(employee);
    }

    public void hireAll(String csvFile)
    {
        try(Scanner scanner=new Scanner(new File(csvFile)))
        {
            while (scanner.hasNextLine())
            {
                String line= scanner.nextLine();
                String[] data=line.split(",");
                Employee employee;
                Manager manager;
                MyDate date=new MyDate(Integer.parseInt(data[3].trim()),Integer.parseInt(data[4].trim()),Integer.parseInt(data[5].trim()));
                if(data.length==6)
                {
                    employee=new Employee(data[0].trim(),data[1].trim(),Double.parseDouble(data[2].trim()),date);
                    employees.add(employee);
                }
                else
                {
                    manager=new Manager(data[0].trim(),data[1].trim(),Double.parseDouble(data[2].trim()),date,data[6].trim());
                    employees.add(manager);
                }
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getStackTrace());
        }
    }

    public void fire(int ID)
    {
        int i=0;
        for (Employee employee:
                employees) {
            if(employee.getID()==ID)
                employees.remove(i);
            i++;
        }
    }

    public void printAll()
    {
        for (Employee employee:
                employees) {
            if (employee instanceof Manager)
                System.out.println("Employee{" +
                        "ID=" + employee.getID() +
                        ", firstName='" + employee.getFirstName() + '\'' +
                        ", lastName='" + employee.getLastName() + '\'' +
                        ", salary=" + employee.getSalary() +
                        ", birthDate=" + employee.getBirthDate() +
                        ", department=" + ((Manager) employee).getDepartment() +
                        '}');
            else
                System.out.println(employee);
        }
    }

    public void printManagers()
    {
        for (Employee employee:
                employees) {
            if(employee instanceof Manager)
                System.out.println(employee);
        }
    }

    public void sortByComparator(Comparator<Employee> comp)
    {
        employees.sort(comp);
    }

}
