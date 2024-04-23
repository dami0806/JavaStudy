package week_03.abs;

public class AudiCar {
    String company; // 자동차 회사 : GENESIS
    String color; // 자동차 색상
    double speed;  // 자동차 속도 , km/h

    public double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    public void horn() {
        System.out.println("Audi 빵빵");
    }

}