package HW1.task2;

public class Program {
    public static void main(String[] args) {
        Signal signal = new Signal();
        (new Thread(new Producer(signal))).start();
        (new Thread(new Consumer(signal))).start();
    }
}