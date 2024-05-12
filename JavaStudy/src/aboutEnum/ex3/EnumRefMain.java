package aboutEnum.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());

        //System.out.println("ref BASIC = " + Grade.BASIC); // enum이 ToString 오버라이딩 -> 실행 결과 ref BASIC = BASIC

        System.out.println("ref BASIC = " + refValue(Grade.BASIC)); // enum이 ToString 오버라이딩 -> 실행 결과 ref BASIC = BASIC
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
