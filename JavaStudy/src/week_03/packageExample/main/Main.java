package week_03.packageExample.main;
import week_03.packageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {
         Car car1 = new Car();
         week_03.packageExample.pk2.Car car2 = new week_03.packageExample.pk2.Car();

        car1.horn();
        car2.horn();
        ;
    }
}
