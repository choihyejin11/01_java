package main.java.com.ohgirrafers.section2.looping;

import java.util.Scanner;

public class Qustion {
    public static void main(String[] args) {

        //자판기를 만들어보자.
        /*
        * 음료수를 입력받는다.
        * 음료수는 사이다, 콜라, 환타, 박카스, 핫식스
        * 개별 가격을 매겨본다
        * 잘못 선택된 음료수일 경우 다시 입력을 받는다
        *
        * 계산하시겠습니까? (y, n)
        * y 이면 총 금액은 " "  입니다.
        *
        * n 이면 음료수를 더 선택 해주세요.
        * 사이다 다시 고르면
        * 계산하시겠습니까? (y,n )
        *
        * 총 금액은 " "  입니다. 프로그램 종료
        * */

        /*
        * 음료수 출력문
        * 음료수 선택
        * 잘못된 음료를 선택하면 처음으로 돌아가기
        * 계산하시겠습니까
        * yes  총 금액은 -- 입니다.
        * no 음료를 더 선택 해주세요.
        *
        * */

        Scanner sc = new Scanner(System.in);

        int totalPrice = 0;
        //세미콜론 두개면 무한루핑
        for(;;){
            System.out.print("사이다(500) 콜라(200) 환타(800) 핫식스(1000) 박카스(1200) ");

            System.out.println("음료를 선택해주세요 : " );
            String choice = sc.nextLine();

            int price = 0 ;

            if(choice.equals("사이다")){
                price = 500;

            } else if (choice.equals("콜라")) {
                price = 200;

            } else if (choice.equals("환타")) {
                price = 800;

            } else if (choice.equals("핫식스")) {
                price = 1000;

            } else if (choice.equals("박카스")) {
                price = 1200;

            }else{
                System.out.println("잘못된 음료입니다. 다시 입력해주세요");
                continue;
            }

            System.out.println("계산하시겠습니까 (yes,no)");
            String chioce2 = sc.nextLine();
            totalPrice += price;

            if(chioce2.equals("yes")){
                System.out.println("총금액은" + totalPrice + "원입니다. ");
                break;
            }else if(chioce2.equals("no")){
                System.out.println("음료를 더 선택해주세요");
            }else {
                System.out.println("정확하게 입력 해주세요");
            }

        }


    }
}
