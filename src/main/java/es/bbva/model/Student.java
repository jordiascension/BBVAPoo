package es.bbva.model;

import java.util.Date;

public class Student {

    private String name;
    private String surname;
    private Date dateOfBirth;

    public Student(){

    }

    public Student(String name, String surname){
         this.name =  name;
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
    }
}
