package com.example.JavaSpringMongo.models;

/**
 * Created by Rafał on 2015-02-26.
 */
public class Starring {
    @Override
    public String toString() {
        return "Starring{" +
                "actor='" + actor + '\'' +
                '}';
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    private String actor;
}
