package aboutEnum.ex3;

import static aboutEnum.ex3.Grade.*;

public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();

        int basic = discountService.discount(BASIC, price); // 상수이기 때문에 static에 넣고 쓸수 있음
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액:" + basic);
        System.out.println("GOLD 등급의 할인 금액:" + gold);
        System.out.println("DIAMOND 등급의 할인 금액:" + diamond);
    }
}
