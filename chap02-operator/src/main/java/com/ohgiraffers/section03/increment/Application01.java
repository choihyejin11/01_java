package main.java.com.ohgiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args) {


        /*
        * 증감 연산자
        * ++x, x++ : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 증가시킨다.
        * --x, x-- :                                   뺀다.
        *
        *
        * */

        int num = 10;
        int num2 = 20 ;
        int result = 0 ;

        result = result  + ++num; //이미 num의 값은 변해있다.
        System.out.println(result);
        System.out.println("num =" + num);

        result = 1;
        result = result + num++;
        System.out.println(result);
        System.out.println("num = " +num);

    }
}