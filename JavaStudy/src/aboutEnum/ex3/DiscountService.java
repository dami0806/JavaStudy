package aboutEnum.ex3;


public class DiscountService {
    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;
        if (classGrade == Grade.BASIC) { // x001을 가리킴 == x001
            discountPercent = 10;
        } else if (classGrade == Grade.GOLD) {
            discountPercent = 20;
        } else if (classGrade == Grade.DIAMOND) {
            discountPercent = 30;
        } else {
            System.out.println(classGrade + "할인X");
        }
        return price * discountPercent / 100;
    }
}
