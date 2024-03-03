package main;

import java.util.ArrayList;

public class Gifu {
    protected String name;
    protected String id;
    protected int maxNumberOfStudents;
    protected ArrayList<Student> students = new ArrayList<>();
    protected ArrayList<Course> courses = new ArrayList<>();
    
    public Gifu(String name, String id, int maxNumberOfStudents){
        this.name = name;
        this.id = id;
        this.maxNumberOfStudents = maxNumberOfStudents;
    }


    //Tällä tulostuu 
    public void list() {
        //Lista = Muuttuja;
        //tähän määritellä lista, esim kurssin kaikki opiskelijat
        for(Student  student : students) {
            student.printList();
        }
        //System.out.println("Huippunopeus: " + maxSpeed + "km/h");
        System.out.println("");
        }
}
