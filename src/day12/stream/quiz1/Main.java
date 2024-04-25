package day12.stream.quiz1;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
         List<Transaction> allValue2021 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2021)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        System.out.println(allValue2021);

        System.out.println("==============================");


        // 연습 2: 거래자가 근무하는 모든 도시이름을 중복 없이 나열하시오.
         List<String> traderCity = transactions.stream()
                 .map(transaction -> transaction.getTrader().getCity())
                 .distinct() // 중복제거
                 .collect(toList());
         System.out.println(traderCity);

        System.out.println("==============================");


        // 연습 3: Cambridge 에 근무하는 모든 거래자(Trader)를 찾아 거래자리스트로 이름순으로 오름차정렬.
        List<Trader> cambridge = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getTrader)
                .sorted(comparing(Trader::getName))
                .distinct() // 중복제거
                .collect(toList());
        cambridge.forEach(System.out::println);

        System.out.println("==============================");


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로 오름차정렬하여 반환
         List<String> allTrader = transactions.stream()
                 .map(transaction -> transaction.getTrader().getName())
                 .distinct() // 중복제거
                 .sorted() // 정렬은 최대한 마지막에 하기 // 정렬기준 없을때 오름차
                 // .sorted(Comparator.reverseOrder()) // 정렬기준 없을때 내림차
                 .collect(toList());
        System.out.println(allTrader);

        System.out.println("==============================");


        // 연습 5: Milan 에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean milan = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println("milan = " + milan);

        System.out.println("==============================");


        // 연습 6: Cambridge 에 사는 거래자의 모든 거래액의 총합 출력.
        int sum = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .mapToInt(Transaction::getValue) // 총합 모음
                .sum();
        System.out.println("CambridgeAllValue = " + sum);

        System.out.println("==============================");


        // 연습 7: 모든 거래에서 최고거래액은 얼마인가?
        int highValue = transactions.stream()
//                .map(transaction -> transaction.getValue())
//                .sorted(reverseOrder())
//                .limit(1)
//                .collect(toList())
//                .get(0);
        .mapToInt(Transaction::getValue)
                .max()
                        .getAsInt();
        System.out.println(highValue);

        System.out.println("==============================");


        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        /*
        자바의 단점: null 체크 문법이 없음
         */
        Transaction lowValue = transactions.stream()
                .min(comparing(Transaction::getValue))
                .orElse(null); // -> 만약 결과가 null 일 경우 어떻게 할까
        System.out.println(lowValue);

        System.out.println("==============================");

        // 연습 9. 거래액이 500 이상인 거래들만 필터링하고, 해당 거래의 정보를 출력하시오.
        List<Transaction> value500Up = transactions.stream()
                .filter(transaction -> transaction.getValue() >= 500)
                .collect(toList());
        System.out.println(value500Up);

        System.out.println("==============================");

        // 연습 10. 모든 거래에서 가장 작은 거래액보다 큰 거래액을 가진 거래의 평균을 계산하시오.
        // 출력값: 752.0

        // 최소 거래액 찾기
        int minValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .min()
                .getAsInt();
//        System.out.println(minValue);
        // 평균 구하기
        double average = transactions.stream()
                    .filter(transaction -> transaction.getValue() > minValue)
                    .mapToInt(Transaction::getValue)
                    .average()
                    .getAsDouble();
        System.out.println("average = " + average);

        System.out.println("==============================");

        // 연습 11. "Cambridge"에서 거래하는 모든 거래자의 거래액을 연도별로 그룹화하여 출력하시오.
        /*
               <출력예시>
                Year: 2021
                {Trader: Brian in Cambridge, year: 2021, value: 300}
                {Trader: Raoul in Cambridge, year: 2021, value: 400}

                Year: 2022
                {Trader: Raoul in Cambridge, year: 2022, value: 1000}
                {Trader: Alan in Cambridge, year: 2022, value: 950}
         */
        /*

        // 1번째 방법
        Map<Integer, List<Transaction>> groupByYearMap = new HashMap<>();

        List<Transaction> trs2021 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2021)
                        .collect(toList());
        List<Transaction> trs2022 = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2022)
                        .collect(toList());
        groupByYearMap.put(2021, trs2021);
        groupByYearMap.put(2022, trs2022);

        for (Integer year : groupByYearMap.keySet()) {
            System.out.println("year = " + year);
            for (Transaction transaction : groupByYearMap.get(year)) {
                System.out.println(transaction);
            }
        }
        */

        // 2번째 방법
        Map<Integer, List<Transaction>> cambridgeTrsMap = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.groupingBy(Transaction::getYear));

        cambridgeTrsMap.forEach((integer, transactions1) -> {
            System.out.println("year = " + integer);
            transactions1.forEach(System.out::println);
        });

        System.out.println("==============================");


        // 연습 12. 모든 거래 중 가장 큰 거래액과 가장 작은 거래액의 차이를 계산하시오.
        // 출력 값 : 700
        System.out.println(highValue - minValue);

    }

}
