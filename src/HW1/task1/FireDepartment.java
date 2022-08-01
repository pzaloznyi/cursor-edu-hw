package HW1.task1;

import java.util.concurrent.Future;

public interface FireDepartment {
    Future<?> call(String district) throws InterruptedException;
}
