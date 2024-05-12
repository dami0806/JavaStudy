package aboutEnum.ref2;

public class EnumRefMain2 {
    public static void main(String[] args) {

        //        DiscountService discountService = new DiscountService();
//        int basic = discountService.discount(Grade.BASIC, price);
//        int gold = discountService.discount(Grade.GOLD, price);
//        int diamond = discountService.discount(Grade.DIAMOND, price);
//

//        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.disount(10000));
//        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.disount(10000));
//        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.disount(10000));

        printDiscount(Grade.BASIC, 10000);
        printDiscount(Grade.GOLD, 10000);
        printDiscount(Grade.DIAMOND, 10000);

        int price = 10000;
        for(Grade grade : Grade.values()) {
            printDiscount(grade, price);
        }
    }
    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + "등급의 할인 금액: " + Grade.BASIC.disount(price));

    }
}
