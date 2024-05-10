package main.java.com.ohgiraffers.section01.method;

public class Application07 {
    public static void main(String[] args) {

        /*
         * 실습
         * 두 수를 매개변수로 받아 더한 값을 반환하는 메소드
         * 두 수를 매개변수로 받아 뺀 값을 반환하는 메소드
         * 두 수를 매개변수로 받아 곱한 값을 반환하는 메소드
         * 두 수를 매개변수로 받아 나눈 값을 반환하는 메소드
         *
         *
         * 반환받아서 메인 메소드에 system.out.println 을 이용해 출력하시오.
         *
         * */

        int num1 = 5;
        int num2 = 3;

        Application07 app7 = new Application07();
        System.out.println(app7.sumMethod(num1, num2));
        System.out.println(app7.minusMethod(num1, num2));
        System.out.println(app7.multyMethod(num1, num2));
        System.out.println(app7.dividMethod(num1, num2));
    }
    public int sumMethod (int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public  int minusMethod (int num1, int num2) {
        int minus = num1 - num2;
        return minus;

    }

    public int multyMethod (int num1, int num2) {
        int multi = num1 * num2;
        return multi;

    }

    public int dividMethod (int num1, int num2) {
        int divid = num1 / num2;
        return divid;
    }










}
