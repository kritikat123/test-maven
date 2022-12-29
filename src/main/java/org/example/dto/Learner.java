package org.example.dto;

public class Learner {

    public Learner(String id) {
        this.id = id;
    }

    private String id;

    public String getId() {
        return "The caller is : " + id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
