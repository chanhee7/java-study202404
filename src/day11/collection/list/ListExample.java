package day11.collection.list;

import java.util.ArrayList;

import java.util.Comparator;

import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> foods = new ArrayList<>();

        foods.add("짜장면");
        foods.add("볶음밥");
        foods.add("ㄷㄷ");

        System.out.println(foods);

        // 중간삽입 add(index, E)
        foods.add(1, "짬뽕");
        System.out.println(foods);

        int size = foods.size();
        System.out.println("size = " + size);

        int index = foods.indexOf("볶음밥");
        System.out.println("index = " + index);

        boolean flag = foods.contains("짬뽕");
        System.out.println("flag = " + flag);

        foods.remove(0);
        foods.remove("볶음밥");
        System.out.println(foods);

        foods.set(0, "탕수육");
        System.out.println(foods);

        String s = foods.get(1);
        System.out.println("s = " + s);

        // 반복문 처리
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i) + " 맛잉씀 ");
        }
        System.out.println("===============");
        for (String food : foods) {
            System.out.println(food + " 맛있 ");
        }

        foods.clear();
        System.out.println(foods);
        System.out.println(foods.isEmpty());

        // 리스트에 초기값 넣고 시작하기
        int[] arr = {10, 20, 30};
        List<Integer> numbers = new ArrayList<>(List.of(24, 99, 10, 20, 30));
//        List<Integer> numbers = new ArrayList<>();
        System.out.println("numbers = " + numbers);

        // 오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println("numbers = " + numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println("numbers = " + numbers);
    }
}
