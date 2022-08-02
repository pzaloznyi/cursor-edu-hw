package HW1.task1;

import java.util.concurrent.*;

public class FireDepartmentImpl implements FireDepartment {
    private final ThreadPoolExecutor fireService;

    public FireDepartmentImpl() {

        fireService = new ThreadPoolExecutor(1, 3, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
    }

    public Future<?> call(String district) {
        return fireService.submit(() -> {
            System.out.printf("Accepting call from %s%n", district);
            return waitForArrival(district);
        });
    }

    private Future<?> waitForArrival(String district) {
        return fireService.submit(() -> {
            System.out.printf("On the way to %s%n", district);
            long millis = ThreadLocalRandom.current().nextInt(2000, 5000);
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("Firemen has been arrived to %s in %s millis%n", district, millis);
        });
    }
}
