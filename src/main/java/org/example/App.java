package org.example;

import org.example.Files.DAO;
import org.example.Files.VideoGame;
import org.example.Files.VideoGameManager;
import org.example.Files.VideoGameTXTDAO;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        DAO<VideoGame> dao = new VideoGameTXTDAO("D:\\Test.txt", "/");
        VideoGameManager manager = new VideoGameManager(dao);
        // manager.seed();
        manager.test();
    }
}
