package day12.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static day12.stream.Menu.*;

public class Sorting {

    public static void main(String[] args) {

        // 육류 요리중 칼로리가 낮은 순으로 정렬하기
        List<Dish> lowCalorieMeatDishes = menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .sorted(Comparator.comparing(md -> md.getCalories()))
                .collect(Collectors.toList());
        System.out.println(lowCalorieMeatDishes);

        System.out.println("==============================");

        // 메뉴 목록에서 메뉴들을 이름 내림차로 정렬 (z y x 순)
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                // .sorted(Comparator.comparing(Dish::getName))  // .reversed() 빼면 오름차
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("==============================");

        // 칼로리가 300칼로리보다 큰 요리중
        // 칼로리 낮은 순으로 앞에서 3개만 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
