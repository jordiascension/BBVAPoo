package es.bbva.model;

import java.time.ZoneId;
import java.util.Date;

import java.time.LocalDate;
import java.time.Period;

public class Student {

    private String name;
    private String surname;
    private Date dateOfBirth;
    private int age;

    public Student() {

    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        calculateAge(dateOfBirth);
    }

    //Los objetos enviados por parámetro a una función se envían por referencia(puntero)
    private void calculateAge(Date dateOfBirth) {
        LocalDate localDateOfBirth = dateOfBirth.toInstant().
                atZone(ZoneId.systemDefault()).toLocalDate();

        LocalDate localNow = LocalDate.now();

        Period diff = Period.between(localDateOfBirth, localNow);
        age = diff.getYears();
    }

    public int getAge() {
        return age;
    }
}
