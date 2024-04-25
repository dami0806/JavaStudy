package week_04_calculator_exception;

import week_03_calculator.step3.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalculatorApp {

    public static boolean start() throws Exception{
        Parser parser = new Parser();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String operator, firstNumber, secondNumber;

            System.out.println("연산자를 입력하세요 (+, -, *, /): ");
            operator = br.readLine();
            parser.parseOperator(operator);

            System.out.println("firstNumber를 적어주세요: ");
            firstNumber = br.readLine();
            parser.parseFirstNum(firstNumber);

            System.out.println("secondNumber를 적어주세요: ");
            secondNumber = br.readLine();
            parser.parseSecondNum(secondNumber);

            System.out.println("연산 결과 : " + parser.executeCalculator());
            return true;


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
