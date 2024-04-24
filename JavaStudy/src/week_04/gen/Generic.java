package week_04.gen;

// 1. 제너릭은 클래스 또는 매서드에 사용가능
// <>안에 들어가야 할 타입을 명시
public class Generic<T> {
    // 2. 내부 필드에 String
    private T t;

    // 3. methadel return tvret String
    public T get() {
        return this.t;
    }

    public void set(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        // 4.제너릭을 통해서 구현한 클래스를 사용하는 부분
        Generic<String> stringGeneric = new Generic<>();     //Generic<Integer> stringGeneric = new Generic<>();
        // 5. 만든객체의 타입: String - "Hello World"정상출력된다.
        stringGeneric.set("Hello World");                   //  stringGeneric.set(3); //Integer일때 3으로 출력

        String tValueTurnOutWithString = stringGeneric.get();

        System.out.println(tValueTurnOutWithString);        // int tValueTurnOutWithString = stringGeneric.get();
    }
}
