package main;

public class Course extends Gifu{


        public Course(String name, String id, int maxNumberOfStudents){
            //int maxNumberOfStudents,
            //this.maxNumberOfStudents = maxNumberOfStudents;
            //this.name = name;
            //this.id = id;
            //this.maxNumberOfStudents = maxNumberOfStudents;
            //super(name, id, maxNumberOfStudents);
            super(name, id, maxNumberOfStudents);
            //courses.add(new Course(name, id));
        }  
   
        public void printList() {
            System.out.println(id + " " + name);
        }   

        public String getInformation() {
            return(id + " " + name);
        }
}
