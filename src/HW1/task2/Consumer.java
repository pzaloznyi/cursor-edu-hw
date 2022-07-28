package HW1.task2;

import java.util.concurrent.ThreadLocalRandom;

class Consumer implements Runnable {
    private final Signal signal;

    public Consumer(Signal signal) {
        this.signal = signal;
    }

    public void run() {
        for (
            var message = this.signal.take();
            !message.equals("DONE");
            message = this.signal.take()
        )
            System.out.format("MESSAGE RECEIVED: %s%n", message);
    }
}
