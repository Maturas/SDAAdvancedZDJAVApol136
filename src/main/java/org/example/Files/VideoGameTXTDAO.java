package org.example.Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class VideoGameTXTDAO implements DAO<VideoGame> {
    private final String filePath;

    public VideoGameTXTDAO(String filePath) {
        this.filePath = filePath;
    }

    public static void testFile(String filePath) {
        System.out.println(checkIfExistsAndCreateIfDoesnt(filePath));
        System.out.println(readStringFromFile(filePath).get());
        System.out.println(readLinesFromFile(filePath).size());
        readLineFromFile(filePath, 2)
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("Line not found!"));
    }

    @Override
    public Boolean create(VideoGame newObj) {
        return null;
    }

    @Override
    public Optional<VideoGame> read(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<VideoGame> readAll() {
        return null;
    }

    @Override
    public Boolean update(VideoGame updatedObj) {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        return null;
    }

    @Override
    public Boolean delete(VideoGame objToDelete) {
        return null;
    }

    private static Boolean checkIfExistsAndCreateIfDoesnt(String filePath) {
        // Checks whether the file exists, and if it doesn't, it creates it
        try {
            File myFile = new File(filePath);
            if (!myFile.exists()) {
                return myFile.createNewFile();
            }
            else {
                return true;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static Optional<String> readStringFromFile(String filePath) {
        try {
            return Optional.of(Files.readString(Paths.get(filePath)));
        }
        catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    private static List<String> readLinesFromFile(String filePath) {
        try {
            return Files.lines(Paths.get(filePath)).toList();
        }
        catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private static Optional<String> readLineFromFile(String filePath, Integer id) {
        List<String> lines = readLinesFromFile(filePath);
        if (id >= 0 && id < lines.size()) {
            return Optional.of(lines.get(id));
        }
        else {
            return Optional.empty();
        }
    }
}
