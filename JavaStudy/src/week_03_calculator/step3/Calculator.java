package week_03_calculator.step3;

import java.util.Map;

public class Calculator {

    private Map<String, AbstractOperation> operations;

    // 생셩자에서 객체 초기화
    public Calculator() {
        operations = Map.of(
                "+", new AddOperation(),
                "-", new SubstractOperation(),
                "*", new MultiplyOperation(),
                "/", new DivideOperation()
        );
    }

    double calculate(String operator, int firstNumber, int secondNumber) throws IllegalArgumentException {
        AbstractOperation operation = operations.get(operator);
        if (operator == null) {
            throw new IllegalArgumentException("유효하지 않은 연산자 입니다.");
        }
        return operation.operate(firstNumber, secondNumber);
//        switch (operator) {
//            case "+":
//                return addOperation.operate(firstNumber, secondNumber);
//            case "-":
//                return substractOperation.operate(firstNumber, secondNumber);
//            case "*":
//                return multiplyOperation.operate(firstNumber, secondNumber);
//            case "/":
//                return divideOperation.operate(firstNumber, secondNumber);
//            default:
//                throw new IllegalArgumentException("유효하지 않은 연산자 입니다.");
//        }
    }
}
