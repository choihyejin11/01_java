package main.java.com.ohgiraffers.section01.literal;

public class Application02 {
    public static void main(String[] args){
        /*정수 리터럴 연산 형식의 값을 직접 연산한다.

        * 1. 123 + 456
        * 2. 123 - 456
        * 3. 123 * 456
        * 4. 40 / 10
        * 5. 10 % 2

         */

        System.out.println(123 + 456);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(40 / 10);
        System.out.println(10 % 2);

        /* 정수와 실수 연산은 실수 한자리수로 표기된다
         */
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        System.out.println("=================");
        /* 문자와 문자의 연산
         */
        /* 필기 문자 끼리의 연산도 사칙 연산 가능하다 */
        /* 지금은 계산 결과가 왜 이렇게 나왔는지보다 연산 사용이 가능하다는 것만 인지 */
        System.out.println('a'+'b');
//       위의 값을 출력하면 195가 된다. 각자 자기 문자의 고유숫자가 있기 때문에...(아스키코드라고 한다)
        System.out.println('ㄱ'+'ㄴ'); //출력하면 25189 나온다. 유니코드
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("=======================");

        /* 문자열은 + 연산만 가능하다 */
        System.out.println("hello" + 123);
        System.out.println("hello" + 123.456);
        System.out.println("hello" + 'a');
        System.out.println("hello" + true);

        System.out.println("123" + "456");

//        논리값 연산
//        System.out.println(true + false); //불가능
        System.out.println(true + "false");
//        System.out.println(true + 1); //불가능

        System.out.println("안녕"+"하세"+"요");
    }
}