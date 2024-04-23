package week_03.sample;

public class Main {
    private int globalNumber = 1; // 전역변수 선언 및 초기화

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.getNumber()); // 초기화되었다가 생겼다가 -> 같은값 나옴
        System.out.println(main.getNumber());
    }

    // method
    public int getNumber() {
        //{지역변수} <->전역변수
        // 지역변수
        // 해당 메서드가 실행될때마다 독립적인 값을 저장,관리
        // 메서드 내부에서 정의될때 생성
        // 이 메서드가 종료될때 소멸

        // 지역변수 선언 및 초기화
        int localNumber = 1;
        localNumber ++;

        // 전역변수 값 증가
        this.globalNumber++;

        // 전역변수 값과 지역변수 값을 출력
        System.out.println("전역변수 값: " + this.globalNumber);
        System.out.println("지역변수 값: " + localNumber);
        return localNumber;
    }
}
