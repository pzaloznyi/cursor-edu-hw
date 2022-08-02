package HW1.task3;

public class Genre implements Runnable {
    private final String genre;

    public Genre(String genre) {
        this.genre = genre;
    }

    @Override
    public void run() {
        System.out.printf("%s - %s%n", genre, SongGenerator.createSong());
    }
}
