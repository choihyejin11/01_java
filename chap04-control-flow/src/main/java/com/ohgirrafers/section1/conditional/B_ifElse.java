package main.java.com.ohgirrafers.section1.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void test1(){

        /*
        * [if-else 조건식]
        *  if(조건식){
        * 조건식이 true일때 실행할 명령문;
        * } else{
        * 조건식이 false일때 실행할 명령문;}
        * */


        /*
       * 정수 한개를 입력 받아 그 수가 홀수이면 " 입력하신 숫자는 홀수입니다" 라고 출력하고
       * 홀수가 아니면 "입력하신 숫자는 짝수입니다" 라고 출력해보자
       * 단, 조건과 상관없이 프로그램 종료될때 "종료"라고 출력해보자
       *
       * */

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력 해주세요");

        int num = sc.nextInt();

        if(num % 2 != 0){
            System.out.println("홀수입니다.");
        }else{
            System.out.println("짝수입니다.");
        }
        System.out.println("종료");
    }

    public void test2() {
        //if-Else 중첩

        /*
        * 숫자를 하나 입력 받아서 "입력하신 숫자는 양수"
        * 음수이면 "입력하신 숫자는 음수" 출력
        * 단, 0이면 "0입니다" 출력
        * 조건 상관없이 종료는 "프로그램 종료" 출력
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 하나 입력하세요");

        int num = sc.nextInt();

        if(num !=0){
            if(num>0) {
                System.out.println("양수입니다");
            }else {
                System.out.println("음수입니다");
            }


        }else {
            System.out.println("입력하신 숫자는 0");
        }
        System.out.println("종료");




    }
}
