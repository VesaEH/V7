package main;

public class Student extends Gifu {

    public Student(String name, String id, int maxNumberOfStudents) {
        super(name, id, 0);
        //students.add(new Student(name, id));
    }

    public void printList() {
        System.out.println(id + " " + name);
    }
}
