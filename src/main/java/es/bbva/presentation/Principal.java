package es.bbva.presentation;

import es.bbva.dao.StudentDao;
import es.bbva.model.Student;

public class Principal {

    public static void main(String[] args) {
        //Nuestro primer objeto
        //Clase nombre_objeto = new Clase();
        Student mariaStudent = new Student();
        mariaStudent.setName("Maria");
        mariaStudent.setSurname("Soto");

        Student jordiStudent = new Student();
        jordiStudent.setName("Jordi");
        jordiStudent.setSurname("Pujol");

        Student pepeStudent = new Student("Pepe", "Ferrer");

        //Polimorfismo
        //Boxing
        Object object = new Student();
        //Unboxing or Casting o conversión de tipos
        ((Student)object).setName("Neus");
        ((Student)object).setSurname("Membrado");

        //Nombre_de_la_clase.Nombre_del_metodo
        StudentDao.addStudent(mariaStudent);
        StudentDao.addStudent(jordiStudent);
        StudentDao.addStudent(pepeStudent);
        StudentDao.addStudent((Student)object);

        StudentDao.showStudents();


        System.out.println("El nombre del estudiante es: " + mariaStudent.getName());
        System.out.println("El apellidos del estudiante es: " + mariaStudent.getSurname());

        System.out.println("El nombre del estudiante es: " + jordiStudent.getName());
        System.out.println("El apellidos del estudiante es: " + jordiStudent.getSurname());

        System.out.println("El nombre del estudiante es: " + pepeStudent.getName());
        System.out.println("El apellidos del estudiante es: " + pepeStudent.getSurname());

        System.out.println("El nombre del estudiante es: " +((Student)object).getName());
        System.out.println("El apellidos del estudiante es: " + ((Student)object).getSurname());
    }
}
