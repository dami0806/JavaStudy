package week_04.exceptionSample;

public class OurClass {
    private final boolean just = true;

    //thorws : 던지다!!(= 예외를 던지다 / 발생시키다)
    public void thisMethodIsDangerous() throws OurBadException {
        if (just) {
            throw new OurBadException();
        }
    }
}
