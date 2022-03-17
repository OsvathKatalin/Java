package oop.labor05.models;

public class Course {
    private String name;
    private String description;
    private int numHours;

    public Course(String name,String description, int numHours) {
        this.name=name;
        this.description=description;
        this.numHours=numHours;
    }


    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getNumHours() {
        return numHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numHours=" + numHours +
                '}';
    }
}
