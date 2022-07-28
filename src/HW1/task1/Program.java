package HW1.task1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * 1) реалізувати за допомогою concurrence пожежну частину, тобто є потоки які очікують сигналу,
 *    і коли поступає сигнал, вони йдуть на виклик.
 */
public class Program {
    public static void main(String[] args) throws InterruptedException {
        var districts = new Districts().generate();
        var calls = Executors.newCachedThreadPool();

        for (var d : districts)
            calls.execute(new Thread(() -> {
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 3000));
                    d.callFiremen();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }));

        calls.awaitTermination(30, TimeUnit.SECONDS);
    }
}
