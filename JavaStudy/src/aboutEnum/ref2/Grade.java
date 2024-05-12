package aboutEnum.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    public int getDiscountPercent() {
        return discountPercent;
    }

    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    private final int discountPercent;
}
