package main.java.com.ohgiraffers.section06;

public class Test {
    public static void main(String[] args) {
        /*
        * 영어시험을 본 결과 1번 학생은 90점, 2번 학생은 95점, 3번 학생은 81점, 4번 학생은 88점을 맞았다.
        * 90~100점 사이에 있는 학생은 합격, 아니라면 불합격을 출력하자.
        *
        *
        *
        * */

        int num1 = 90 ;
        int num2 = 95 ;
        int num3 = 81 ;
        
        int num4 = 88 ;


        String result1 = (num1 >= 90) ? "합격": (num1 >= 100)? "합격" : "불합격";
        String result2 = (num2 >= 90) ? "합격": (num2 >= 100)? "합격" : "불합격";
        String result3 = (num3 >= 90) ? "합격": (num3 >= 100)? "합격" : "불합격";
        String result4 = (num4 >= 90) ? "합격": (num4 >= 100)? "합격" : "불합격";

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);







    }
}
