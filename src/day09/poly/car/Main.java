package day09.poly.car;

public class Main {
    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

//        Car[] sArr = {sonata1, sonata2, sonata3};
//
//        for (Car sonata : sArr) {
//            sonata.accelerate();
//        }

        Car tusan1 = new Tusan();
        Car tusan2 = new Tusan();

        Car mustang1 = new Mustang();
        Car mustang2 = new Mustang();
        Car mustang3 = new Mustang();
        Car mustang4 = new Mustang();

        // 다형성을 통해 이종 모음 배열을 구현할 수 있음
        Car[] cArr = {sonata1, tusan2, mustang1};
        for (Car car : cArr) {
            car.accelerate();
        }

        Object[] sArr = {"a", "b", 1, 2}; // 오브젝트배열...데이터타입 상관없음

        System.out.println("===========================================");

        Driver drive = new Driver();

        drive.drive(sonata3);
        drive.drive(new Mustang());


    }
}
