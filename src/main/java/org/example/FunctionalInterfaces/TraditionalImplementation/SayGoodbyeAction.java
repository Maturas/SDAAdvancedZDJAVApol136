package org.example.FunctionalInterfaces.TraditionalImplementation;

public class SayGoodbyeAction implements Action {
    @Override
    public void invoke() {
        System.out.println("Goodbye!");
    }
}
