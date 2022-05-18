package com.example;

public class Spell extends Artifact {


    public Spell(String name) {

    }


    @Override
    public void use() {
        System.out.println("Abracadabra using " + this.name + " (Spell)");
    }


}
