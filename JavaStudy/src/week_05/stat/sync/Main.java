package week_05.stat.sync;

public class Main {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();

        Runnable task = () -> {
            while (appleStore.getStoredApple() > 0) {
                appleStore.eatApple();
                System.out.println("남은 사과의 수 = " + appleStore.getStoredApple());
            }

        };
        // 3개의 thread를 한꺼번에 만들어서 Start를 해버림!!
        //  생성(NEW)과 동시에 start(NEW -> RUNNABLE)
        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }
    }
}

class AppleStore {
    private int storedApple = 10;

    public int getStoredApple() {
        return storedApple;
    }

    public void eatApple() {
        synchronized (this) { // 이거없다면 쓰레드 3개중 2개가 조건에서 문제
            if (storedApple > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storedApple -= 1;
            }
        }
    }
}
