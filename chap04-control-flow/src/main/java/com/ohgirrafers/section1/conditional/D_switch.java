package main.java.com.ohgirrafers.section1.conditional;

import java.util.Scanner;

public class D_switch {

    public void testSwitch() {


        /*
        * [switch문 표현식]
        *
        * switch(비교할 변수){
        * case 비교값 1: 비교값1과 일치하는 경우 실행할 구문; break;
        * case 비교값 2: 비교값2과 일치하는 경우 실행할 구문; break;
        * case 비교값 3: 비교값3과 일치하는 경우 실행할 구문; break;
        * defult : case 모두에 해당하지 않는 경우 실행할 구문; break;
        * }
        *
        * 여러개의 비교값중 일치하는 조건에 해당하는 로직을 실행하는 것은 is-else-if 와 유사하다.
        * 따라서 일부 호환이 가능하다
        * 하지만 switch 문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
        * 실수와 논리는 비교할 수 없다.
        * 또한 정확하게 일치하는 경우에만 비교할 수 있으며, 대소비교를 할 수 없다.
        * case 절에는 변수를 사용하지 못한다.
        *
        *
        * */

        //정수 두개와 연산 기호를 입력 받아서
        //두 숫자와 연산 결과를 출력해보는 계산기


        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수 입력 : ");
        int a = sc.nextInt();

        System.out.println("두번째 정수 입력: ");
        int b = sc.nextInt();

        System.out.println("연산 기호 입력");
        char c = sc.next().charAt(0);

        int result = 0 ;

        switch (c) {
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
            case '+': result = a + b; break;
            case '%': result = a % b; break;
        }
        System.out.println(a+" "+ c +" "+ b+ "=" + result);
    }

    public void testSwitch2() {
        System.out.println("============자판기============");
        System.out.println("사이다(1000) 콜라(1200) 환타(800) 박카스(1000) 핫식스(1500)");
        System.out.println("음료를 선택해주세요");

        Scanner sc = new Scanner(System.in);
        String selectDring = sc.nextLine();

        int price = 0;

        switch (selectDring) {
            case "사이다" : price = 1200; break;
            case "콜라" : price = 1000; break;
            case "환타" : price = 800; break;
            case "박카스" : price = 1500; break;
            case "핫식스" : price = 1600; break;
            default :
                System.out.println("그런 음료는 없습니다."); break;


        }
        System.out.println(selectDring + "를 선택하셨습니다");
        System.out.println(price + "원 투입 해주세요");




    }
}
