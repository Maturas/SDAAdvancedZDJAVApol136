package org.example;

import org.example.Files.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        DAO<VideoGame> dao = new VideoGameJSONDAO("D:\\videogames.json");
        VideoGameManager manager = new VideoGameManager(dao);
        // manager.seed();
        manager.test();
    }
}
