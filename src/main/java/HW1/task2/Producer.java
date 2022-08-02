package HW1.task2;

import java.util.concurrent.ThreadLocalRandom;

class Producer implements Runnable {
    private final Signal signal;

    public Producer(Signal signal) {
        this.signal = signal;
    }

    public void run() {
        String[] messages = {"Message 1", "Message 2", "Message 3", "Message 4"};

        for (String s : messages) {
            System.out.println("MESSAGE SENT: " + s);
            signal.put(s);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(3000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        signal.put("DONE");
    }
}