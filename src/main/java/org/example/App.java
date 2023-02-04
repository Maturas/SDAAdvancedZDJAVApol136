package org.example;

import org.example.Reflection.ReflectionExamples;
import org.example.Reflection.VideoGame;

public class App {
    public static void main( String[] args ) {
        ReflectionExamples.getClassSuperclass(VideoGame.class);
        ReflectionExamples.getClassInterfaces(VideoGame.class);
    }
}
