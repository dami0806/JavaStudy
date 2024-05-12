package aboutEnum.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        // 모든 Enum 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("name" + value.name() + ", ordinal = " + value.ordinal());
        }
        // String -> Enum 변환
        String input = "GOLD";
        Grade grade = Grade.valueOf(input);
        System.out.println("gold = " + grade);
    }
}
