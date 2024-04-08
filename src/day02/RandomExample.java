package day02;

public class RandomExample {

    public static void main(String[] args) {

        // 연산자 우선순위
        // 단항(++, --, !) > 이항(*, /, %...) > 삼항(?:) > 대입(=)

        int a = 10;
        int b = ++a - 10 * 3;

        /*
            자바에서 난수만들기

            x ~ y 사이의 정수 난수 만드는 공식
            (int) (Math.random() * (y - x + 1)) + x
        */

        // Math.random => 0.0 <= ~ < 1.0
        // (int) Math.random => 0 <= ~ < 1
        int rn = (int) Math.random() * 10 + 1;
        System.out.println("rn =" + rn);

        // Math.random * 10 => 0.0 <= ~ < 10.0
        int rnn = (int) (Math.random() * 10) + 1;
        System.out.println("rnn =" + rnn);

    }
}
