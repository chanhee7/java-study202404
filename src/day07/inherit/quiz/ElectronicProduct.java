package day07.inherit.quiz;

public class ElectronicProduct {

    String productName;
    double price;
    String manufacturer;

    public void displayInfo() {
        // double = %f
        // %f 는 실수 찍어낼때 소수점 6자리 까지 찍어냄
        // System.out.printf(가격: %.2f원) => price.00원
        // System.out.printf(가격: %.3f원) => price.000원
        System.out.printf("%s, 가격: %.0f원, 제조사: %s\n",
                this.productName, this.price, this.manufacturer);
    }
}
