package HW1.task3;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Playlist {
    private final ConcurrentLinkedQueue<String> queue;

    public Playlist() {
        queue = new ConcurrentLinkedQueue<>();
    }

    public void addToPlaylist(String song) {
        queue.add(song);
    }

    public void showPlaylist() {
        while (queue.iterator().hasNext())
            System.out.println(queue.poll());
    }
}
