package week_03_calculator.step3;

public class Calculator {
    private AddOperation addOperation;
    private SubstractOperation substractOperation;
    private MultiplyOperation multiplyOperation;
    private DivideOperation divideOperation;

    // 생셩자에서 객체 초기화
    public Calculator() {
        this.addOperation = new AddOperation();
        this.substractOperation = new SubstractOperation();
        this.multiplyOperation = new MultiplyOperation();
        this.divideOperation = new DivideOperation();
    }

    double calculate(String operator, int firstNumber, int secondNumber) throws IllegalArgumentException {
        switch (operator) {
            case "+":
                return addOperation.add(firstNumber, secondNumber);
            case "-":
                return substractOperation.sub(firstNumber, secondNumber);
            case "*":
                return multiplyOperation.multi(firstNumber, secondNumber);
            case "/":
                return divideOperation.div(firstNumber, secondNumber);
            default:
                throw new IllegalArgumentException("유효하지 않은 연산자 입니다.");
        }
    }
}
