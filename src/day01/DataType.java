package day01;

public class DataType {

    public static void main(String[] args) {

        // 1byte = 8bit
        // 1bit = 숫자 0이나 1을 저장할 수 있음
        // 1111 => 8 + 4 + 2 + 1 == 15
        // 11111111 => 128 + 64 + 32 + 16 + 8 + 4 + 2 + 1 == 255
        // byte, short 잘 안씀! (메모리 너무 작음) / 그냥 int, long 쓰자

        // 음수,양수를 구분을 위해 맨 첫자리 비트 비움 (부호비트)
        // -> 1byte = 7bit
        // 1 1111111 => 64 + 32 + 16 + 8 + 4 + 2 + 1 == -127
        // 0 1111111 => 64 + 32 + 16 + 8 + 4 + 2 + 1 == 127
        byte a = 127; // 1byte
        short b = 32767; // 2byte
        int c = 213231313; // 4byte
        // L = 롱타입의 범위만큼 더 저장하는 접미사
        long d = 1111111111111111111L; // 8byte (~900경)


        // 실수 저장 = float, double
        // float 은 double 과 구분하기 위해 접미사 F 붙힘
        float e = 3.1412312412412412412412412F; // 4byte
        double f = 3.14124123124314213124123;   // 8byte
        double g = 100;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g); // 100.0 으로 출력


        // 논리 저장 boolean
        boolean flag1 = true;
        // boolean flag1 = false;
        boolean flag2 = 10 > 5;

        double random = Math.random();

        int x = 200;
        System.out.println(x + a);
        System.out.println(b * x);

        // 문자형 char : 2byte 0 ~ 65536
        // char 형식 -> char text = '';
        // char text = 65; // 65 = A , 66 = B ...
        char text = '하';
        System.out.println("text = " + text); // 하

        // 문자열 : 문자 배열
        char[] hello = {'안', '녕', '하', '세', '요'};
        System.out.println("hello = " + new String(hello)); // 안녕하세요

        String hello2 = "안녕하세요";
    }
}