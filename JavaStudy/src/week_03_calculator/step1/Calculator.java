package week_03_calculator.step1;

/*
<aside>
1️⃣ 더하기, 빼기, 나누기, 곱하기 연산을 수행할 수 있는 Calculator 클래스를 만듭니다.

- Calulator 클래스는 연산을 수행하는 반환 타입이 double인 calculate 메서드를 가지고 있습니다.
- calculate 메서드는 String 타입의 operator 매개변수를 통해 연산자 매개값을 받습니다.
- int 타입의 firstNumber, secondNumber 매개변수를 통해 피연산자 값을 받습니다.
- calculate 메서드는 전달받은 피연산자, 연산자를 사용하여 연산을 수행합니다.
 */
public class Calculator {

    // 메서드
    double calculate(String operator, int firstNumber, int secondNumber) throws IllegalArgumentException {
        // 더하기, 빼기, 나누기, 곱하기
        switch (operator) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
                }
                return (double) firstNumber / secondNumber;
            case "%":
                if (secondNumber == 0) {
                    throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
                }
                return (double) firstNumber % secondNumber;
            default:
                throw new IllegalArgumentException("유효하지 않은 연산자 입니다.");
        }

    }

}
