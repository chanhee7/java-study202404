package day08.super_;

public class Child extends Parent {

//    int a;
//    double b;
    boolean c;

    Child() {
//        super(); // this 나 super 가 없을시 쓰지 않아도 자동으로 입력됨
        this(100);
        System.out.println("Child 클래스의 생성자 호출!");
        this.c = true;
    }
    Child(int x) {
//        super();
        System.out.println("Child 클래스의 2번째 생성자 호출!");
    }

    void childMethod() {
        System.out.println("child a = " + this.a);
        System.out.println("child b = " + this.b);
        System.out.println("child c = " + this.c);
    }
}