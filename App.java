package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Gifu newGifu = null;
        Student newStudent = null;
        Course newCourse = null;
        Enrollment newEnrollment = null;

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students  = new ArrayList<>();
        ArrayList<Course> courses  = new ArrayList<>();
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        System.out.println("Tervetuloa Gifu-järjestelmään");

        System.out.println("Mille yliopistolle haluat ottaa järjestelmän käyttöön?");
        String Uname = sc.nextLine();
        String Uid = "";
        int UmaxNumberOfStudents = 0;
        newGifu = new Gifu(Uname,Uid, UmaxNumberOfStudents);
        

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Luo uusi kurssi, 2) Luo uusi opiskelija, 3) Listaa kurssit, 4) Listaa opiskelijat, 5) Lisää opiskelija kurssille, 6) Anna kurssiarvosanat, 7) Listaa kurssilla olevat opiskelijat, 8) Listaa opiskelijan arvosanat, 9) Listaa kaikkien kurssien kaikkien opiskelijoiden arvosanat, 0) Lopeta ohjelma");
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:
                        System.out.println("Anna kurssin nimi:");
                        String name = sc.nextLine();
                        System.out.println("Anna kurssin ID:");
                        String id = sc.nextLine();
                        System.out.println("Anna kurssin maksimi opiskelijamäärä:");
                        int maxNumberOfStudents = Integer.parseInt(sc.nextLine());
                        newCourse = new Course(name, id, maxNumberOfStudents);
                        courses.add(newCourse);
                                              
                        break;
                    case 2:
                        System.out.println("Anna opiskelijan nimi:");
                        String name2 = sc.nextLine();
                        System.out.println("Anna opiskelijan opiskelijanumero:");
                        String id2 = sc.nextLine();

                        newStudent = new Student(name2, id2, 0);
                        students.add(newStudent);

                        break;
                    case 3:
                        //listaa kurssit ja indeksin
                        int j = 0;
                    
                        for (Course course: courses) {
                            System.out.println(j++ + ") " + course.getInformation());
                        }
                        
                        //for (Course course: courses) {
                        //    course.printList();
                        //}
                        break;
                    case 4:
                        
                        //listaa opiskelijat indeksillä
                        int k = 0;
                    
                        for (Student student: students) {
                            System.out.println(k++ + ") " + student.getInformation());
                        }                    
                    
                        //System.out.println("Listaa opiskelijat ");
                        //for (Student student: students) {
                        //    student.printList();
                        //}
                        break;
                    case 5:                        
                        int j2 = 0;                   
                        for (Course course: courses) {
                            System.out.println(j2++ + ") " + course.getInformation());
                        }
                        System.out.println("Mille kurssille haluat lisätä opiskelijan? Syötä kurssin numero:");
                        int courseParameter = Integer.parseInt(sc.nextLine());                        
                        
                        int k2 = 0;
                        for (Student student: students) {
                            System.out.println(k2++ + ") " + student.getInformation());
                        } 
                        System.out.println("Minkä opiskelijan haluat lisätä kurssille? Syötä opiskelijan numero:");
                        int studentParameter = Integer.parseInt(sc.nextLine());
                        //int grade = -1;
                        //course.enrollStudent(course(x), student(y));
                        newEnrollment = new Enrollment(-1, studentParameter, courseParameter);
                        enrollments.add(newEnrollment);

                        break;
                    case 6:
                        System.out.println("Seilaa laivoja");
                        break;
                    case 7:
                        System.out.println("Seilaa laivoja");
                        break;
                    case 8:
                        System.out.println("Seilaa laivoja");
                        break;
                    case 9:
                        System.out.println("kaikki kurssit ja opiskelijat");
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
            }
        }
    }
    sc.close();
    }
}
