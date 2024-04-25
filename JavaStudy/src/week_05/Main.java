package week_05;

public class Main {
    public static void main(String[] args) {
        // 쓰레드
//        TestThread thread = new TestThread();
//        thread.start();
        //Runnable 을 더 선호
        Runnable run = new TestRunnable();
        Thread thread = new Thread(run);
        thread.start();


    }
}

