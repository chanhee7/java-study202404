package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {

    public static void main(String[] args) {

        String[] list = {};

            Scanner scan = new Scanner(System.in);

            System.out.println("# 먹고 싶은 음식을 입력하세요!!");
            System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
        while (true) {
            String input = scan.nextLine();

            if (input.equals("그만")) {
                break;
            } else {
                // 새 배열
                String[] zz = new String[list.length + 1];

                for (int i = 0; i < list.length; i++) {
                    zz[i] = list[i];
                }
                zz[zz.length - 1] = input;
                list = zz;
            }
        }
        System.out.println("먹고 싶은 음식리스트: " + Arrays.toString(list));
    }
}
