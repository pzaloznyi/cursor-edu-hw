package HW1.task3;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 3) зробити 5 потоків, кожен потік має генерувати пісні(кожен потік окремий жанр)
 *    і ці пісні потрібно зберігати десь щоб всі потоки могли достукатись до них
 */
public class Program {
    public static void main(String[] args) {
        var playlist = new Playlist();

        for(var genre : new String[]{"Pop", "Hip-Hop", "EDM", "Rock", "R&B"})
            new Thread(() ->
            {
                while (true){
                    playlist.addToPlaylist(String.format("%s - %s", genre, SongGenerator.createSong()));
                    try {
                        Thread.sleep(ThreadLocalRandom.current().nextInt(1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();

        while(true)
            playlist.showPlaylist();
    }
}

