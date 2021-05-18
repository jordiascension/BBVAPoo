package es.bbva.presentation;

import es.bbva.dao.StudentDao;
import es.bbva.model.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Principal {

    public static void main(String[] args) throws ParseException {
        //Nuestro primer objeto
        //Clase nombre_objeto = new Clase();
        Student mariaStudent = new Student();
        mariaStudent.setName("Maria");
        mariaStudent.setSurname("Soto");
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        mariaStudent.setDateOfBirth(formatter.parse("26-04-1975"));

        Student jordiStudent = new Student();
        jordiStudent.setName("Jordi");
        jordiStudent.setSurname("Pujol");
        jordiStudent.setDateOfBirth(formatter.parse("10-03-1976"));

        Student pepeStudent = new Student("Pepe", "Ferrer");
        pepeStudent.setDateOfBirth(formatter.parse("11-04-1955"));

        //Polimorfismo
        //Boxing
        Object object = new Student();
        //Unboxing or Casting o conversión de tipos
        ((Student)object).setName("Neus");
        ((Student)object).setSurname("Membrado");
        ((Student)object).setDateOfBirth(formatter.parse("21-05-1966"));

        //Nombre_de_la_clase.Nombre_del_metodo
        StudentDao.addStudent(mariaStudent);
        StudentDao.addStudent(jordiStudent);
        StudentDao.addStudent(pepeStudent);
        StudentDao.addStudent((Student)object);

        StudentDao.showStudents();


        System.out.println("El nombre del estudiante es: " + mariaStudent.getName());
        System.out.println("El apellidos del estudiante es: " + mariaStudent.getSurname());
        System.out.println("La fecha de naciemiento del estudiante es: " + mariaStudent.getDateOfBirth());

        System.out.println("El nombre del estudiante es: " + jordiStudent.getName());
        System.out.println("El apellidos del estudiante es: " + jordiStudent.getSurname());
        System.out.println("La fecha de naciemiento del estudiante  es: " + jordiStudent.getDateOfBirth());

        System.out.println("El nombre del estudiante es: " + pepeStudent.getName());
        System.out.println("El apellidos del estudiante es: " + pepeStudent.getSurname());
        System.out.println("La fecha de naciemiento del estudiante  es: " + pepeStudent.getDateOfBirth());

        System.out.println("El nombre del estudiante es: " +((Student)object).getName());
        System.out.println("El apellidos del estudiante es: " + ((Student)object).getSurname());
        System.out.println("La fecha de naciemiento del estudiante  es: " + ((Student)object).getDateOfBirth());
    }
}
