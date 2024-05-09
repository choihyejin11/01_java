package main.java.com.ohgiraffers.section04.overflow;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 자료형별 최대 범위를 벗어나는 경우 : overflow
        * 예) byte -128~127 사이 범위를 벗어나는 경우임.

         */

        byte num1 =127;
        System.out.println("num1 : " + num1);
        num1 ++ ;
        System.out.println(num1);

        /*
        * underflow : 오버플로우 반대개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
         */

        byte num2 = -128;
        System.out.println("num2 : " + num2);
        num2--;
        System.out.println(num2);

        int firstNum = 1000000;
        int secondNum = 700000;
        int multi = firstNum * secondNum;
        System.out.println(multi);

        //오버플로우를 해결하려면?
        //long으로 자료형을 변환시켜준다.
          long multi2 = (long) firstNum * secondNum;
        System.out.println(multi2);




    }
}
