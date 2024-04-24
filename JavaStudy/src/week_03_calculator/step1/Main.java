package week_03_calculator.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String operator;
            int firstNumber, secondNumber;

            System.out.println("연산자를 입력하세요 (+, -, *, /, %): ");
            operator = br.readLine();

            System.out.println("firstNumber를 적어주세요: ");
            firstNumber = Integer.parseInt(br.readLine());

            System.out.println("secondNumber를 적어주세요: ");
            secondNumber = Integer.parseInt(br.readLine());


            Calculator cal = new Calculator();
            double answer = cal.calculate(operator, firstNumber, secondNumber);

            System.out.printf("%d %s %d = %.2f", firstNumber, operator, secondNumber, answer);

        } catch (IOException e) {
            System.out.println("입력 에러 발생: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("숫자 입력 에러 발생: " + e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println("계산에 에러가 발생했습니다." + e.getMessage());

        }
    }
}
