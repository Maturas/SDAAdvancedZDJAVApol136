package org.example.Files;

public class VideoGame {
    private final String title;
    private final String publisher;
    private final String genre;
    private final Integer releaseYear;

    public VideoGame(String title, String publisher, String genre, Integer releaseYear) {
        this.title = title;
        this.publisher = publisher;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public VideoGame(String textLine, String separator) {
        String[] splitLine = textLine.split(separator);

        if (splitLine.length != 4) {
            throw new IllegalArgumentException();
        }
        else {
            this.title = splitLine[0];
            this.publisher = splitLine[1];
            this.genre = splitLine[2];

            try {
                this.releaseYear = Integer.parseInt(splitLine[3]);
            }
            catch (NumberFormatException e) {
                throw new IllegalArgumentException();
            }
        }
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

    @Override
    public String toString() {
        return this.title + "|" + this.publisher + "|" + this.genre + "|" + this.releaseYear;
    }
}
