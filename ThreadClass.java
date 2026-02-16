
import java.util.Scanner;

public class ThreadClass {
    public static void main(String[] args) { // this is main thread always

        // threads, JVM allow a program to run multiple task simultaneously
        // help performs
        // like file i/o, networking backend, or background task
        // each thread have its own proitiy, so it will excute based on that, if a
        // threads calls another threads means it will inheritance it parnet thread
        // proitiy

        // to create threads
        // 1 extends the thread class (simple)
        // 2 implement the runnable interface (better)

        // thread will run till these things happens:-
        // 1 the exit method of the thread class is called
        // 2 all the user threads are done or died

        System.err.println("threads before start " + Thread.activeCount());

        Counter c = new Counter(); // create new object of our class that implements runnable interface
        Thread thread = new Thread(c); // pass the object, thread accpect runnable interface, it will work
        // thread.start(); // start the thread, it will start in the background
        // the above thread is normal thread so our main program will wait till all the
        // threads are completed
        // to make the created thread stop as when the main thread is stoped use deamon
        // threads before start the threads
        // Daemon threads have most low proitiy

        thread.setDaemon(true);
        thread.start();

        System.err.println("threads after start " + Thread.activeCount());
        System.err.println("threads name " + Thread.currentThread().getName());

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter your name, u have 5 sec");
        String name = sc.nextLine();

        System.out.println("Hello " + name);

        sc.close();

    }
}

class Counter implements Runnable {

    // runnable is a interface which have run method, so we should override it

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("error InterruptedException");
            }

            if (i == 5) {
                System.err.println("Time up broo");
                System.exit(0);
            }

        }
    }

}