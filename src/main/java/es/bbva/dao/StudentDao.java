package es.bbva.dao;

import es.bbva.model.Student;

import java.util.ArrayList;

public class StudentDao {

    //Lista de objetos en memoria ram--TODOS LOS OBJETOS HEREDAN DE OBJECT
    private static ArrayList studentList = new ArrayList();

    public static void addStudent(Student student){
        studentList.add(student);
    }

    public static void showStudents(){
        System.out.println("Los Nombres de todos los estudiantes");

        for (Object object : studentList) {
            System.out.println(((Student)object).getName());
        }

        //With lambda expressions
        studentList.forEach((object) -> {
                System.out.println(((Student)object).getName());
        });
    }
}
