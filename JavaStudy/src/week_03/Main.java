package week_03;

public class Main {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        A a1 = new B();
        a1.a();
        // a1.b(); // 불가능

        System.out.println("\nB 강제 타입변환");
        B b = (B) a1;
        b.a();
        b.b(); // 강제 타입변환으로 사용 가능
        System.out.println();

//        // A 인터페이스에 구편체 B를 상속받은 C 대입
        // a1은 인터페이스 A타입(자동 형변환)이기 때문에, a() 메소드만 가지고 있음!!
          // A타입에는 a만 C에는 a,b,c
//        A a2 = new C();

//        a2.a();
//        //a2.b(); // 불가능
//        //a2.c(); // 불가능
//
//        System.out.println("\nC 강제 타입변환");
//        C c = (C) a2;
//        c.a();
//        c.b(); // 강제 타입변환으로 사용 가능
//        c.c(); // 강제 타입변환으로 사용 가능


    }
}

interface A { //A - a
    void a();
}
class B implements A { //B - a,b
    @Override
    public void a() {
        System.out.println("B.a()");
    }

    public void b() {
        System.out.println("B.b()");
    }
}
class C extends B { // C - B(a,b),c
    public void c() {
        System.out.println("C.c()");
    }
}