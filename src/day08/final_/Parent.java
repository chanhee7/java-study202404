package day08.final_;

class Child extends Parent {

    @Override
    void sing() {
        System.out.println("노래래");
    }

//    @Override
//    void dance() {
//        System.out.println("댄스스");
//    }
}


public class Parent {

    void sing() {
        System.out.println("노래");
    }
    final void dance() {
        System.out.println("댄스");
    }
}