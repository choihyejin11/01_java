package main.java.com.ohgiraffers.section01.method;

import org.w3c.dom.ls.LSOutput;

public class Application09 {
    public static void main(String[] args) {

        /*다른 클래스에 작성한 메소드 호출*/
        //최소값, 최대값을 비교할 두 정수 선언
        int first = 100;
        int second = 50;

        //non-method 메소드의 경우
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(first, second);
        System.out.println(min);

        //static 메소드인 경우
        int max = Calculator.maxNumberOf(first, second);
        System.out.println(max); //효율적

        int max2 = calc.maxNumberOf(first, second);
        System.out.println(max2);

    }
}
