package week_04.exceptionSample;

// 예외 클래스를 만들어서 예외 정의 !!!
public class OurBadException extends Exception {
    public OurBadException() {
        super("위험한 행동을 하면 반드시 예외처리를 해야함!");
    }
}

