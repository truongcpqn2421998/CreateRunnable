public class Main {
    public static void main(String args[]) {
        System.out.println("Main thread running... ");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-T1");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-S2");
        runnableDemo2.start();

        System.out.println("Main thread stopped!!! ");
    }
}
