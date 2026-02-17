
public class MultiThreadClass {
    public static void main(String[] args) throws InterruptedException {

        // run more the one threads

        Game ping = new Game("PING");
        Game pong = new Game("PONG");

        Thread t1 = new Thread(ping);
        Thread t2 = new Thread(pong);

        System.err.println("Game starts");

        // t1.setDaemon(true); print game over, beacuse threads are daemon that runs in
        // background
        // t2.setDaemon(true);

        t1.start();
        t2.start();

        t1.join(); // join method join the threads to "this" current thread(main) so
        // current thread will not run till those finish
        t2.join();

        // t1.join()
        // t2.join()

        System.out.println("im not running");

        System.err.println("Game over");

        MyThread th = new MyThread();
        th.start();

    }
}

class Game implements Runnable {
    private final String text;

    public Game(String text) {
        this.text = text;
    }

    @Override
    public void run() {

        for (int i = 1; i < 6; i++) {

            try {
                Thread.sleep(1000);
                System.out.println(text);
            } catch (InterruptedException e) {
                System.err.println(e);
            }

        }

    }

}

class MyThread extends Thread { // this is also another way of create threads but its inheritance so u cant have another parnets class, in other method u can achivce inheritance

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}