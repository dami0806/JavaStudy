package week_05.stat.interrupt;

// 1. 쓰레드가 start()된 후 동작하다가 interrupt() 만났을때 catch문 빠지는지 확인
// 2. interruped 상태가 true인거 확인
public class Main {
//    public static void main(String[] args) {
//        Runnable task = () -> {
//            //🍷try
//            try {
//                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName()); //출력 안됨 sleep()가자마자 ⭐️thread.interrupt로예외로 빠짐
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("task : " + Thread.currentThread().getName());
//        };
//
//        Thread thread = new Thread(task, "Thread");
//        thread.start(); ////start -> 🍷try 의 sleep()하고 print...
//        // ⭐️thread.interrupt
//        thread.interrupt(); // 🍷try 의 sleep()을 방해 -> InterruptedException로 빠짐
//
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//    }
//}

    // 예외없이도 가능하다
    // sleep()가자마자 interrupt되서 바로나온다 확인!!
    public static void main(String[] args) {
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}