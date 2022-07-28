package HW1.task2;

/**
 * 2) продюсер-отримувач: один потік відправляє дані, інші його отримають і опрацьовують
 */
public class Program {
    public static void main(String[] args) {
        Signal signal = new Signal();
        (new Thread(new Producer(signal))).start();
        (new Thread(new Consumer(signal))).start();
    }
}