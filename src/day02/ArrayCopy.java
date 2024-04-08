package day02;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        String[] pets = {"멍멍", "야옹", "짹짹"};
//        String[] petsCopy = pets; // 이렇게 하면 배열 복사가 아니라 배열 주소복사

        // 실제 배열 복사
        String[] petsCopy = new String[pets.length];
        for (int i = 0; i < pets.length; i++) {
            petsCopy[i] = pets[i];
        }

        pets[1] = "냥냥"; // 복사 후 원본 수정

        System.out.println("pets = " + Arrays.toString(pets));
        System.out.println("petsCopy = " + Arrays.toString(petsCopy));
    }
}
