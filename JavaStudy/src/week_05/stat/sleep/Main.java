package week_05.stat.sleep;

// (1) 예외처리 필수!\
// - interrupt() 를 만나면 다시 실행되기 때문에
// - InterruptedExceotion이 발생할 수 있어요.
// (2) 특정 쓰레드 지목 불가
 // - static: thread.sleep() = Thread.sleep()
public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {

                Thread.sleep(2000); // sleep이 깨지면 -> 예외⭐️실행
            } catch (InterruptedException e) {
                e.printStackTrace(); // 예외⭐️2 TIMED_WAITING(주어진 시간동안만 기다리는 상태)
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread"); // New
        thread.start(); // New -> Runnable

        try {
            //  1초가 지나고 나면 runnable 상태로 변하여 다시 실행돼
            thread.sleep(1000); //thread는 static : Static member 'java.lang.Thread.sleep(long)' accessed via instance reference
           //Thread.sleep();으로 하던 똑같은 동작(static)
            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}