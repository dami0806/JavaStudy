package week_03.object;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        double speed = car.gasPedal(100, 'D');
        boolean lights = car.onOffLight();

        System.out.println(lights);
        car.carSpeeds(100, 80);
        car.carSpeeds(100, 110, 150);

    }
}
