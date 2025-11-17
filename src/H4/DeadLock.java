package H4;

public class DeadLock {

    private Object object1 = new Object();
    private Object object2 = new Object();

    public static void main(String[] args) {
        DeadLock liveLock = new DeadLock();
        new Thread(liveLock::operation1, "T1").start();
        new Thread(liveLock::operation2, "T2").start();
    }

    public void operation1() {
        while (true) {
        synchronized (object1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
                System.out.println("Захвачен объект 1 потоком 1");

                synchronized (object2) {
                    System.out.println("Захвачен объект 2 потоком 1");
                }
            }
        }
    }

    public void operation2() {
        while (true) {
        synchronized (object2) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
                System.out.println("Захвачен объект 2 потоком 2");
                synchronized (object1) {
                    System.out.println("Захвачен объект 1 потоком 2");
                }
            }
        }
    }
}

