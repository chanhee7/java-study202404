package day02;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("**** 상품 재고 총액 구하기 ****");
        System.out.print("-상품의 가격: ");
        int money = Integer.parseInt(scan.nextLine());

        System.out.print("-상품의 수량: ");
        int count = Integer.parseInt(scan.nextLine());

        int total = money * count;

        System.out.printf("상품 재고 총액: %d원\n", total);
    }
}
