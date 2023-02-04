package org.example;

import org.example.Reflection.ReflectionExamples;
import org.example.Reflection.VideoGame;

public class App {
    public static void main( String[] args ) {
        VideoGame game = new VideoGame("Crysis", "Crytek", "Shooter", 2007);
        ReflectionExamples.getValueOfAPrivateField(game, "title", String.class);
        ReflectionExamples.setValueOfAPrivateField(game, "title", "Killzone");
        ReflectionExamples.getValueOfAPrivateField(game, "title", String.class);
    }
}
