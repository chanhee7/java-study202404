package day10.abs;

public class Dog extends Pet {

    @Override
    public void walk() {

    }

    @Override
    public void eat() {
        System.out.println("강아지 사료 먹음");
    }

    @Override
    public void sleep() {
        System.out.println("강아지 낮잠 잠");
    }
}
