package com.jackflow.brainboxv2.model;

import java.util.ArrayList;

public class User {

    private String name;

    private String surname;

    private String email;

    private ArrayList<Note> notes;

    protected User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    protected User(String name, String surname, String email, ArrayList<Note> notes) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.notes = notes;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }
}
