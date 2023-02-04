package org.example.Files;

public class VideoGame {
    private final Integer id;
    private final String title;
    private final String publisher;
    private final String genre;
    private final Integer releaseYear;

    public VideoGame(Integer id, String title, String publisher, String genre, Integer releaseYear) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.id.toString() + "|" + this.title + "|" + this.publisher + "|" + this.genre + "|" + this.releaseYear;
    }
}
