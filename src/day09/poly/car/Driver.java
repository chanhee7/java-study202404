package day09.poly.car;

public class Driver {

    public void drive(Car car) {

        String carName = "";
        if (car instanceof Sonata) {
            carName = "쏘나타";
        } else if (car instanceof Tusan) {
            carName = "투싼";
        } else if (car instanceof Mustang) {
            carName = "머스탱";
        }

        System.out.println("운전을 시작합니다");
        car.accelerate();

    }
}
