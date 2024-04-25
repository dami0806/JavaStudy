package week_05;

public class Main {
    public static void main(String[] args) {
//        TestThread thread = new TestThread();
//        thread.start();
//        Runnable run = new TestRunnable();
//        Thread thread = new Thread(run);
//        thread.start();

        // 1. 구현했던 내용을 task에 담는다
        // 2. Thread를 만들때 넣는다
        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        };

        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}

