package day08.final_;

public class Student {

    String name;
    private final String ssn; // 주민번호
    static final String nation = "대한민국"; // 모든 사람의 국적 "대한민국"

//    private static final // prsf
//    public static final String // psfs
//    public static final int // psfi

    Student(final String ssn) {
//        ssn = "123456";

        final int a = 10;
//        a = 20;
        this.ssn = ssn;

        double pi = Math.PI;
    }
}
