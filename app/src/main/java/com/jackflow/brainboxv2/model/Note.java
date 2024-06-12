package com.jackflow.brainboxv2.model;

public class Note {

    private String title;

    private String text;

    public Note() {
    }

    /**
     * a simple class representing a note
     * @param title title of the note
     * @param text actual text of the note
     */
    public Note(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

