package aboutEnum.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30), VIP(40);

    //    public int getDiscountPercent() {
//        return discountPercent;
//    }
    public int disount(int price) {
        return price * discountPercent / 100;
    }

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    private final int discountPercent;
}
