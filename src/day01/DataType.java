package day01;

public class DataType {

    public static void main(String[] args) {

        // 1byte = 8bit
        // 1bit = 숫자 0이나 1을 저장할 수 있음
        // 1111 => 8 + 4 + 2 + 1 == 15
        // 11111111 => 128 + 64 + 32 + 16 + 8 + 4 + 2 + 1 == 255
        byte a = 127; // 1byte
        short b = 32767; // 2byte
        int c = 213231313; // 4byte
        long d = 1111111111111111111L; // 8byte

        float e = 3.1412312412412412412412412F; // 4byte
        double f = 3.14124123124314213124123;   // 8byte
        double g = 100;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        boolean flag1 = true;
        // boolean flag1 = false;
        boolean b2 = 10 > 5;

        double random = Math.random();

        int x = 200;
        System.out.println(x + a);
        System.out.println(b * x);

        // 문자형 char : 2byte 0 ~ 65536
        // char text = 65; // 65 = A , 66 = B ...
        char text = 'ㅎ';
        System.out.println("text = " + text);

        // 문자열 : 문자 배열
        char[] hello = {'안', '녕', '하', '세', '요'};
        System.out.println("hello = " + new String(hello));

        String hello2 = "안녕하세요";
    }
}