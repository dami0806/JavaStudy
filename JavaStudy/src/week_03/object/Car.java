package week_03.object;


// [클래스 만들기 위한 4가지 STEP]
// 1. 만들려고 하는 설계도를 선언한다. (클래스 선언)
// 2.  속성 (필드)을 정의한다.
// 3. 객체를 생성하는 방식을 정의한다. (생성자)
// 4.  행위 (메서드)를 정의한다.

import week_03.parameter.Door;
import week_03.parameter.Handle;
import week_03.parameter.Tire;

//image - Car설계그림 참고
public class Car {

    /// 필드영역 1) 고유 데이터, 2)상태 데이터 3) 객체 데이터
    // 1) 고유 데이터: 변하지 않는 고유
    String company;// 자동차 회사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색
    int price; // 자동차 가격

    // 2) 상태 데이터: 계속 변하는
    double speed; // 자동차 속도, km/h
    char gear; // 기어상태(P, R, N, D)
    boolean lights;// 자동차 조명의 상태

    // 3) 객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;


    // 생성자 : 처음 객체가 생성되 때 () 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의
    public Car() {}

    /* <메소드> */
    // input:kmh, output: speed
    double gasPedal(double kmh, char type) {
        changeGear('O');
        speed = kmh;
        return speed;
    }

    // input:x, output: speed
    double breakPedal() {
        speed = 0;
        return speed;
    }

    // input:gear(char), output: gear
    char changeGear(char type) {
        gear = type;
        return gear;
    }

    // input:x, output: lights(boolean)
    boolean onOffLight() {
        lights = !lights;
        return lights;
    }

    // input:x, output: x
    void horn() { // input:x, output: x
        System.out.println("빵빵");
    }

    //자동차의 속도 ..가변길이 메서드
    void carSpeeds(double... speeds) {
        for (double v : speeds) {
            System.out.println("v =" + v);
        }
    }
}


