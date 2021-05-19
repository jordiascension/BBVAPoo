package es.bbva.model;

public class Teacher extends Person{
    private int numCourses;
    private String[] courses;

    public Teacher(String name, String surname, int numCourses, String[] courses) {
        super(name, surname); //Llama al constructor de la clase base
        this.numCourses = numCourses;
        this.courses = courses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    //sobrescribe el método de la clase base
    //La Sobreescritura es la forma por la cual una clase que hereda puede re-definir
    // los métodos de su clase Padre, de esta manera puede crear nuevos métodos con
    // el mismo nombre de su superClase
    @Override
    public void printToConsole()
    {
        super.printToConsole();
        System.out.println(numCourses);
    }
}
