package day05.player;

public class Main {

    public static void main(String[] args) {

        // 2번 생성자 호출 출력
        Player parking = new Player("주차왕파킹");
        Player insultKing = new Player("욕설왕뻐킹");

        System.out.println("parking = " + parking);
        System.out.println("insultKing = " + insultKing);

        parking.attack(insultKing);
        parking.attack(insultKing);
        parking.attack(insultKing);
        insultKing.attack(parking);

        // 4번, 1번 생성자 호출 출력
        Player p1 = new Player();

        // 4번, 3번 생성자 호출 출력
        Player p2 = new Player("", 0);

        // 4번 생성자 호출 출력
        Player p3 = new Player("", 0, 1);
    }
}
