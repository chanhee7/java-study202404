package day05;

// import - 클래스 밖에 쓰기
// 다른 패키지에 있는 클래스를 로딩할 때 이름을 축약해서 쓰기위해 사용
//import day05.juice.Apple;
//import day05.juice.Banana;
//import day05.juice.Peach;

// 임포트 한줄로 다불러옴
import day05.juice.*;

public class PackageMain {

    public static void main(String[] args) {

        day05.fruit.Apple a1 = new day05.fruit.Apple();
        Apple a2 = new Apple();
        new Banana();
        new Peach();

        java.util.Scanner sc = new java.util.Scanner(System.in);
    }
}
