package es.bbva.dao;

import es.bbva.model.Student;

import java.util.ArrayList;

public class StudentDao {

    //Lista de objetos en memoria ram--TODOS LOS OBJETOS HEREDAN DE OBJECT
    private static ArrayList studentList = new ArrayList();
    //Generics--colecciones fuertemente tipadas a partir de java 5

    public static void addStudent(Student student){
        studentList.add(student); //AUTOBOXING
    }

    public static void showStudents(){
        System.out.println("Los Nombres de todos los estudiantes");

        for (Object object : studentList) {
            System.out.println(((Student)object).getName());
        }

        //With lambda  & streams
        studentList.forEach((object) -> {
                System.out.println(((Student)object).getName());
        });
    }

    public static void showStudentsWithAge40To60(){
        System.out.println("Los Nombres de todos los estudiantes mayores de 40 y menores de 60");

        for (Object object : studentList) {
            if (((Student)object).getAge()>=40 && ((Student)object).getAge()<=60)
                System.out.println(((Student)object).getName());
        }

        //With lambda  & streams
        studentList.stream()                // convert list to stream
                   .filter(studentObject -> ((Student)studentObject).getAge()>=40 &&
                                            ((Student)studentObject).getAge()<=60)
                   .map(studentObject -> ((Student)studentObject).getName())
                   .forEach(System.out::println);
    }
}
