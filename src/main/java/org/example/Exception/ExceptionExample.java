package org.example.Exception;

public class ExceptionExample {
    public static void example() throws IllegalAmountOfBreadException {
        // How to raise some common exceptions
        Integer[] emptyArray = new Integer[0];
        // System.out.println(emptyArray[1]); // This will cause ArrayIndexOutOfBoundsException

        String[] nullArray = null;
        // System.out.println(nullArray.length); // This will cause NullPointerException

        // System.out.println(10 / 0); // This will cause ArithmeticException

        Person person = new Person();
        person.eatBread(-5); // This will cause IllegalAmountOfBreadException
    }
}
