package H4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LoopedThreads {

    private Lock thread1 = new ReentrantLock(true);
    private Lock thread2 = new ReentrantLock(true);
    private boolean flag = true;

    public static void main(String[] args) {
        LoopedThreads loopedThreads = new LoopedThreads();
        new Thread(loopedThreads::threa1Output).start();
        new Thread(loopedThreads::threa2Output).start();
    }

    public void threa1Output() {
        while (true) {
            synchronized (LoopedThreads.class) {
                if (flag) {
                    System.out.println("1");
                    flag = false;
                }
            }
        }
    }

    public void threa2Output() {
        while (true) {
            synchronized (LoopedThreads.class) {
                if (!flag) {
                    System.out.println("2");
                    flag = true;
                }
            }
        }
    }
}


