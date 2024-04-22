package day10.abs;

public class Cat extends Pet {

    @Override
    public void eat() {
        System.out.println("고양이 생선 먹음");
    }

    @Override
    public void sleep() {
        System.out.println("고양이 낮잠 많이잠");
    }
}
