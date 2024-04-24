package week_03_calculator.step3;

public class DivideOperation {
    public double div(int firstNumber, int secondNumber) {
        if(secondNumber == 0){
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return (double)firstNumber / secondNumber;
    }
}
