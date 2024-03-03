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

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students  = new ArrayList<>();
        ArrayList<Course> courses  = new ArrayList<>();

        System.out.println("Tervetuloa Gifu-järjestelmään");

        System.out.println("Mille yliopistolle haluat järjestelmän käyttöön?");
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
                        System.out.println("Anna kurssin maksimi opiskelijamääräs:");
                        int maxNumberOfStudents = Integer.parseInt(sc.nextLine());
                        newCourse = new Course(name, id, maxNumberOfStudents);
                        courses.add(newCourse);
                                              
                        break;
                    case 2:
                        System.out.println("Anna opiskelijan nimi:");
                        String name2 = sc.nextLine();
                        System.out.println("Anna opiskelija opiskelijanumero:");
                        String id2 = sc.nextLine();

                        newStudent = new Student(name2, id2, 0);
                        students.add(newStudent);


                        //System.out.println("Listaa kulkuneuvot ");
                        //for (Vehicle vehicle: vehicles) {
                        //    vehicle.printSpecs();
                        //}
                        break;
                    case 3:
                        //System.out.println("Listaa kurssit ");
                        for (Course course: courses) {
                            course.printList();
                        }
                        
                        /* 
                        System.out.println("Aja autoa");
                        
                        for (Vehicle vehicle: vehicles) {
                            if (newVehicle instanceof Car){
                                vehicle.drive();
                            } else {
                                System.out.println("Ei ollu auto");
                            }                                                    
                        }*/
                        /*if (newVehicle instanceof Car) {
                            newVehicle.drive();
                        }*/
                        break;
                    case 4:
                        //System.out.println("Listaa opiskelijat ");
                        for (Student student: students) {
                            student.printList();
                        }
                        break;
                    case 5:
                        System.out.println("Seilaa laivoja");
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
