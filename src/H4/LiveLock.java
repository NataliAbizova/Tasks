package H4;

public class LiveLock {

    boolean button1 = true;
    boolean button2 = false;

    public static void main(String[] args) {
        LiveLock lock = new LiveLock();
        new Thread(lock::switching1, "User1").start();
        new Thread(lock::switching2, "User2").start();
    }

    void switching1() {
        while (true) {
            if (button1 == true) {
                button1 = false;
                System.out.println("Нить 1 переключила кнопку 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            if (button2 == true) {
                button2 = false;
                System.out.println("Нить 1 переключила кнопку 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            if (button1 == false && button2 == false) {
                System.out.println("Победила первая нить");
                break;
            }
        }
    }


    void switching2() {
        while (true) {
            if (button1 == false) {
                button1 = true;
                System.out.println("Нить 2 переключила кнопку 1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            if (button2 == false) {
                button2 = true;
                System.out.println("Нить 2 переключила кнопку 2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            if (button1 == true && button2 == true) {
                System.out.println("Победила вторая нить");
                break;
            }
        }
    }
}