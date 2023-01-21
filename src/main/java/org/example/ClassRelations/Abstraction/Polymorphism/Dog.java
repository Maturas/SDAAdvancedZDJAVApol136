package org.example.ClassRelations.Abstraction.Polymorphism;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Woof woof");
    }
}
