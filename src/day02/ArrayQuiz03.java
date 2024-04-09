package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz03 {

    public static void main(String[] args) {

        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        Scanner scan = new Scanner(System.in);

        // 변경 전 정보
        System.out.println("* 변경 전 정보 : " + Arrays.toString(members));

        // 수정할 멤버 이름 입력
        System.out.println("- 수정할 멤버의 이름을 입력하세요.");
        System.out.printf(">> ");
        String input = scan.nextLine();

        // members 배열에서 탐색
        int index = -1;
        for (int i = 0; i < members.length; i++) {
            if(input.equals(members[i])) {
                index = i;
                break;
            }
        }

        // members 배열에서 삭제후 변경
        for (int i = 0; i < members.length; i++) {
            members[i] = members[i + 1];
        }

    }
}
