package day11.api.lang;

public class Wrapper {

    // 기본값 차이
    private int number1; // int 기본값 0
    private Integer number2; // Integer 기본값 null

    Wrapper() {
        // Integer 사용할때 값 0으로 만들어놓기
        this.number2 = 0;
    }

    public static void main(String[] args) {

        // byte, short, int, long, boolean, float, double, char
        // primitive type (기본 타입, 기초 타입, 원시 타입)

        // Wrapper type (기본 타입을 객체로 포장함)
        // Byte, Short, Integer, Long, Boolean, Float, Double, Character
        Integer a  = 10;  // int a = 10; 이랑 같음
        Double b = 3.3;


    }
}
