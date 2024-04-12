package day05;

public class ListMain {

    public static void main(String[] args) {

        /*
            const foods = {
            sArr: []
            push: function(newData);
            indexOf: function(target);
            };

            const userNames = {
            sArr: []
            push: function(newData);
            indexOf: function(target);
            };
        */

        StringList foods = new StringList();
        StringList userNames = new StringList();

        // 배열 내부 데이터 수 확인
        System.out.println(foods.size());

        // 배열에 데이터 추가
        foods.push("짬뽕");
        foods.push("치킨");
        userNames.push("영희");
        foods.push("탕수");

        // 자료 삭제
        foods.remove("짬뽕");

        // 자료 중간 삽입
        userNames.push("김철수");
        userNames.push("홍길동");

        userNames.insert(1, "뽀로로");
        foods.insert(1, "마라탕");

        // 배열 데이터 수정
        foods.set(0, "김치볶음밥"); // 0번 인덱스 수정
        userNames.set(1, "대길이");

        // 배열 데이터 전체 삭제
        foods.clear(); // foods 배열 내부가 전체삭제되고 size 가 0이 되어야 함

        // 배열 데이터가 한개라도 있는지 확인
        boolean flag = foods.isEmpty(); // 배열이 비어있으면 true, 아니면 false

        System.out.println("foods = " + foods.toString());
        System.out.println("userNames = " + userNames.toString());
        System.out.println("flag = " + flag);
    }
}