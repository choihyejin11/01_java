package main.java.com.ohgiraffers.section05.typecasting;

public class test {
    public static void main(String[] args) {

        /*
        * 5명의 학생이 있으며 학생의 키는 각각
        * 178.5 / 170.3 / 190.7 /188.67 / 160.8 이다.
        * 우리는 학생의 평균 키를 구해서 화면에 보여주고하 한다. (소수자리는 절삭)
        * 화면에 보여지는 양식은 다음과 같아.
        * 1번 학생 5명의 평균 키는 ()cm이다.
         */

        double a = 178.5;
        double b = 170.3;
        double c = 190.7;
        double d = 188.67;
        double e = 160.8;

        int average = (int) ((a+b+c+d+e) / 5);

        System.out.println("학생 5명의 평균키는"+ average + "cm이다" );






    }
}
