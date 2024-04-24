package week_03_calculator.step3;

public class DivideOperation extends AbstractOperation {

    @Override
    public double operate(int firstNumber, int secondNumber) {
        if(secondNumber == 0){
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }
        return (double)firstNumber / secondNumber;
    }
}
