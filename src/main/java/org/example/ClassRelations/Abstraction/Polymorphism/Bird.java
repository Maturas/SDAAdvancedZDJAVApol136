package org.example.ClassRelations.Abstraction.Polymorphism;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void tweet() {
        System.out.println("Tweet");
    }
}
