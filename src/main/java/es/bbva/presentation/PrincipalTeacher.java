package es.bbva.presentation;

import es.bbva.model.Teacher;

public class PrincipalTeacher {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Pepe","Soto",
                                   4, new String[]{"Primero", "Segundo", "Tercero"});
        teacher.setIdentityCard("323424234V");
        System.out.println("The teacher UUID is " + teacher.getUuid().toString());
        System.out.println("The teacher's name is " + teacher.getName());
        System.out.println("The teacher numCourses is " + teacher.getNumCourses());

        teacher.printToConsole();
    }
}
