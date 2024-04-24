package week_03_calculator.step3;

import week_03_calculator.step3.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
<>
3️⃣ AddOperation(더하기), SubstractOperation(빼기), MultiplyOperation(곱하기), DivideOperation(나누기) 연산 클래스를 만든 후 클래스 간의 관계를 고려해서
 Calculator 클래스와 관계를 맺습니다.

- 관계를 맺은 후 필요하다면 Calculator 클래스의 내부 코드를 변경합니다.
    - 나머지 연산자(%) 기능은 제외합니다.
- Step 2 와 비교하여 어떠한 점이 개선되었는지 생각하기.
    - hint. 클래스의 책임(단일 책임 원칙)
 */
public class Main {
    public static void main(String[] args) {


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String operator;
            int firstNumber, secondNumber;

            System.out.println("연산자를 입력하세요 (+, -, *, /): ");
            operator = br.readLine();

            System.out.println("firstNumber를 적어주세요: ");
            firstNumber = Integer.parseInt(br.readLine());

            System.out.println("secondNumber를 적어주세요: ");
            secondNumber = Integer.parseInt(br.readLine());

            Calculator cal = new Calculator();
            double answer = cal.calculate (operator, firstNumber, secondNumber);

            System.out.printf("%d %s %d = %.2f", firstNumber, operator, secondNumber, answer);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
