package day03;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};

    // printFoods
    public static void printFoods() {
        System.out.println(Arrays.toString(foods));
    };


    // 사이즈를 조절해서 새 배열을 만드는 함수
    static String[] makeNewArray(int size) {
        return new String[foods.length + size];
    }


    // 기존 데이터를 복사하는 함수
    static String[] copy(int size) {
        //사이즈가 1개 큰 배열 생성
        String[] temp = makeNewArray(size);

        int loopCount = (size >= 0) ? foods.length : temp.length;

        for (int i = 0; i < loopCount; i++) {
            temp[i] = foods[i];
        }
        return temp;
    }


    // foods배열에 데이터를 끝에 추가하는 함수
    static void push(String newFoods) {
        //사이즈가 1개 큰 배열 생성

        String[] temp = copy(1);

        // 새 배열의 끝 인덱스에 새 데이터 추가
        temp[temp.length - 1] = newFoods;
        foods = temp;
        // temp = null;  // 함수는 알아서 연결 끊음 (안써도댐)
    }


    // foods배열에서 특정 데이터의 인덱스를 반환
    static int indexOf(String searchFood) {
        int index = -1;
        for (int i = 0; i < foods.length; i++) {
            if (searchFood.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }

    // foods배열에서 맨 끝 데이터를 삭제하는 함수
    static void pop() {
         copy(-1);
    }

    // remove
    static void remove(String deleteTarget) {
        int index = indexOf(deleteTarget);
        if (index == -1) return;

        for (int i = index; i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }
        pop();
    }

    // include
    static boolean include(String searchTarget) {
        return indexOf(searchTarget) != -1;
    }

    // modify
    static void modify(int targetIndex, String newFoodName) {
        // targetIndex가 foods배열 벗어나지 않기위해 if문 사용
        if (targetIndex < 0 || targetIndex > foods.length - 1) return;
        foods[targetIndex] = newFoodName;
    }

    // insert
    static void insert(int targetIndex, String newFoodName) {
        if (targetIndex < 0 || targetIndex > foods.length - 1) return;
        String[] temp = copy(1);
        for (int i = temp.length; i > targetIndex; i--) {
            temp[i] = temp[i - 1];
        }
        temp[targetIndex] = newFoodName;
        foods = temp;
    }



    public static void main(String[] args) {

        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

        pop();
        remove("치킨");
        printFoods();

        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(3, "파인애플");
        printFoods();

        modify(2, "닭갈비");
        printFoods();
    }

}
