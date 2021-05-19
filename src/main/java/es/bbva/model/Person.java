package es.bbva.model;

import java.util.UUID;

public class Person {
    private String name;
    private String surname;
    private String identityCard;
    private UUID uuid;

    public Person(String name, String surname, String identityCard) {
        this(name,surname);//dry principle--don't repeat yourself
        this.identityCard = identityCard;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.uuid = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void printToConsole()
    {
        System.out.println( name + " " + surname);
    }
}
