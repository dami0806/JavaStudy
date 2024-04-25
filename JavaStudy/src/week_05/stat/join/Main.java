package week_05.stat.join;

// join 5초 기다림 확인
public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(5000); // 5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "thread"); // New

        thread.start(); // New -> Runnable

        long start = System.currentTimeMillis();

//        try {
//            thread.join(); // 있고 없고 차이 main은 기다리지않고
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // thread 의 소요시간인 5000ms 동안 main 쓰레드가 기다렸기 때문에 5000이상이 출력
        System.out.println("소요시간 = " + (System.currentTimeMillis() - start));
    }
}