package day12.stream.quiz2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {

    public static void main(String[] args) {

        Destination paris = new Destination("Paris", "France");
        Destination rome = new Destination("Rome", "Italy");
        Destination berlin = new Destination("Berlin", "Germany");

        Traveler alice = new Traveler("Alice", "alice@example.com");
        Traveler bob = new Traveler("Bob", "bob@example.com");
        Traveler charlie = new Traveler("Charlie", "charlie@example.com");

        List<Booking> bookings = List.of(
                new Booking(alice, paris, 2022, 2000),
                new Booking(bob, rome, 2021, 1500),
                new Booking(alice, berlin, 2023, 1800),
                new Booking(charlie, paris, 2022, 2200),
                new Booking(bob, paris, 2021, 2500)
        );

        // 연습 1: 2022년에 예약된 모든 여행을 찾아 가격 오름차 정렬.
        List<Booking> booking2022 = bookings.stream()
                .filter(booking -> booking.getYear() == 2022)
                .sorted(Comparator.comparing(Booking::getPrice))
                .collect(toList());
        System.out.println(booking2022);
        System.out.println("==============================");

        // 연습 2: 여행지가 있는 모든 나라 이름을 중복 없이 나열하시오.
        List<String> destinationAllCountry = bookings.stream()
                .map(booking -> booking.getDestination().getCountry())
                .distinct() // 중복 제거
                .collect(toList());
        System.out.println(destinationAllCountry);
        System.out.println("==============================");

        // 연습 3: Paris 에 예약된 모든 여행자를 찾아 이름순으로 오름차 정렬.
        List<Traveler> parisTraveler = bookings.stream()
                .filter(booking -> booking.getDestination().getCity().equals("Paris"))
                .map(Booking::getTraveler)
                .sorted(Comparator.comparing(Traveler::getName))
                .collect(toList());
        System.out.println(parisTraveler);
        System.out.println("==============================");

        // 연습 4: 모든 여행자의 이메일을 리스트에 모아서 알파벳순으로 오름차정렬하여 반환.
        List<String> allEmails = bookings.stream()
                .map(booking -> booking.getTraveler().getEmail())
                .distinct() // 중복 제거
                .sorted()
                .collect(toList());
        System.out.println(allEmails);
        System.out.println("==============================");

        // 연습 5: Italy 로의 여행이 한 건이라도 있는지 여부 확인.
        boolean italy = bookings.stream()
                .anyMatch(booking -> booking.getDestination().getCountry().equals("Italy"));
        System.out.println(italy);
        System.out.println("==============================");

        // 연습 6: France 로의 모든 여행의 총 가격을 출력.
        double franceAllPrice = bookings.stream()
                .filter(booking -> booking.getDestination().getCountry().equals("France"))
                .mapToDouble(Booking::getPrice)
                .sum();
        System.out.println("franceAllPrice = " + franceAllPrice);
        System.out.println("==============================");

        // 연습 7: 예약된 모든 여행에서 최고 가격은 얼마인가?
        double maxPrice = bookings.stream()
                .mapToDouble(Booking::getPrice)
                .max()
                .orElse(0);
        System.out.println("maxPrice = " + maxPrice);
        System.out.println("==============================");

        // 연습 8: 가장 저렴한 여행의 정보 탐색.
        double minPrice = bookings.stream()
                .mapToDouble(Booking::getPrice)
                .min()
                .orElse(0);
        System.out.println("가장 저렴한 여행의 정보 = " + minPrice);
        System.out.println("==============================");

        // 연습 9: 가격이 2000 이상인 모든 여행 예약 정보를 출력.
        List<Booking> priceUp2000 = bookings.stream()
                .filter(booking -> booking.getPrice() >= 2000)
                .collect(toList());
        System.out.println("가격이 2000 이상인 모든 여행 예약 정보 = " + priceUp2000);
        System.out.println("==============================");

        // 연습 10: 모든 예약에서 가장 낮은 가격보다 높은 가격을 가진 예약의 평균 가격을 계산하시오.
        double averagePrice = bookings.stream()
                .filter(booking -> booking.getPrice() > minPrice)
                .mapToDouble(Booking::getPrice)
                .average()
                .orElse(0);
        System.out.println("모든 예약에서 가장 낮은 가격보다 높은 가격을 가진 예약의 평균 가격 = " + averagePrice);
        System.out.println("==============================");

        // 연습 11: 모든 여행자의 여행 예약을 여행지별로 그룹화하여 출력하시오.
        Map<String, List<Booking>> bookingsByDestination = bookings.stream()
                .collect(Collectors.groupingBy(booking -> booking.getDestination().getCity()));
        bookingsByDestination.forEach((destination, bList) -> {
            System.out.println("Destination: " + destination);
            bList.forEach(System.out::println);
        });
        System.out.println("==============================");

        // 연습 12: 모든 예약 중 최고 가격과 최저 가격의 차이를 계산하시오.
        double price = maxPrice - minPrice;
        System.out.println("모든 예약 중 최고 가격과 체저 가격의 차이 = " + price);
    }

}
