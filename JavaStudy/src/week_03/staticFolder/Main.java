package week_03.staticFolder;

public class Main {
    public static void main(String[] args) {

        // 클래스 필드
        System.out.println(Car.company + "\n");
        Car.company = "Audi";
        System.out.println(Car.company + "\n");

        // 클래스 메서드
        String companyName = Car.setCompany("Benz");
        System.out.println("companyName = " + companyName);

        System.out.println();

        // static company라 굳이 인스턴스화 할 필요는 없지만 가능하다
        Car car = new Car(); // 객체 생성
        // 클래스 필드
        car.company = "Ferrari";
        System.out.println(car.company + "\n");

        // 클레스 메서드
        String companyName2 = car.setCompany("Lamborghini");
        System.out.println("companyName2 = " + companyName2);
    }
}
