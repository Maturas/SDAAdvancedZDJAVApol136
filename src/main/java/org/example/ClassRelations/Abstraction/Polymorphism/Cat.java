package org.example.ClassRelations.Abstraction.Polymorphism;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("Meow");
    }
}
