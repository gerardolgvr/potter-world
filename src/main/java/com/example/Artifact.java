package com.example;

public abstract class Artifact {

    String name;

    public Artifact(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println("Using artifact " + this.name);
    }
}
