package week_05.demon;

/*
JVM은 사용자 쓰레드의 작업이 끝나면 데몬 쓰레드도 자동으로 종료시켜버림
실행시 task 우선실행 99까지 정상출력, 마지막이 demon 확인 다 못채운 번쨰에서 안기다리고 끝나버림
 */
public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println(i + "demon");
            }
        };

        // 우선순위가 낮다! => 상대적으로 다른 쓰레드에 비해 리소스를 적게 할당받는다. 좀 느리게 실행
        Thread thread = new Thread(demon);
        thread.setDaemon(true); // true로 설정시 데몬스레드로 실행됨

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i + "task");
        }
    }
}