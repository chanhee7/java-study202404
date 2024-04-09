package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {

    public static void main(String[] args) {

        /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드
            1. 음식명을 입력받는다.
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로운 음식명을 마지막 위치에 추가한다.
         */

        // 밑에랑 같음(생략 가능)
        // String[] list = new String[] {};
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
                    // 좌항: 영역, 우항: 값
                    zz[i] = list[i];
                }
                zz[zz.length - 1] = input;
                list = zz;
            }
        }
        System.out.println("먹고 싶은 음식리스트: " + Arrays.toString(list));
    }
}
