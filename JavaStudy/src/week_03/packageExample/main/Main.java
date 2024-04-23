package week_03.packageExample.main;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car(); 다른패키지에 있어서 불가

        // 클래스의 일부분이며, 하위 패키지를 도트(.)로 구분한다.
            // import week_03.packageExample.pk1.Car는 다음 코드에서
        week_03.packageExample.pk1.Car car1 = new week_03.packageExample.pk1.Car();
        week_03.packageExample.pk2.Car car2 = new week_03.packageExample.pk2.Car();

        car1.horn();
        car2.horn();
        ;
    }
}
