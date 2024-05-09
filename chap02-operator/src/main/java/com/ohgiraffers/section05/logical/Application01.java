package main.java.com.ohgiraffers.section05.logical;

public class Application01 {
    public static void main(String[] args) {


        /*
        * 논리 연산자
        * 논리값을 취급하는 연산자 (true || false )
        *
        * 논리 연산자의 종류
        * 1. 논리 연결 연산자 : 두개의 피연산자를 가지는 이항 연산자이며,
        * 연산자의 결합 방향은 왼쪽에서 오른쪽. 두개의 논리식을 판단하여 참과 거짓을 판다.
        * 1-1. && (And논리) : 두개의 논리식 모두 참일 경우 참을 반환,
        * 둘 중 하나라도 거짓인 경우 거짓을 반환
        * 1-2 . || (or논리) : 두개의 논리식 중 하나라도 참일 경우 참
        * 두개 모두 거짓이면 거짓
        * 2. 논리 부정 연산자 : 피연산자가 하나인 단항 연산자
        * 2-1. !(not논리) : 논리식의 결과가 참이면 거짓, 거짓이면 참을 반환.
        *        *
        *
        * */

        System.out.println("true와 true의 and 논리 연산 : " + (true && true));
        System.out.println("true와 false의 and 논리 연산 : " + (true && false));
        System.out.println("false와 false의 and 논리 연산 : " + (false && false));

        System.out.println("true와 true의 or 논리 연산 : " + (true ||  true));
        System.out.println("true와 false의 or 논리 연산 : " + (true ||  false));
        System.out.println("false와 false의 or 논리 연산 : " + (false ||  false));

        int a = 10 ;
        int b = 20 ;
        int c = 30 ;
        int d = 40 ;

        System.out.println("================");
                                                                //a=10 , b=20, c=30, d=40
        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + ((a<b) && (c<d)));
        System.out.println("a가 b보다 크면서 c가 d보다 작은지 확인 : " + ((a>b) && (c<d)));
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + ((a<b) && (c>d)));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + ((a>b) && (c>d)));

        System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + ((a<b) || (c<d)));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + ((a>b) || (c>d)));
        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + ((a<b) || (c<d)));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + ((a>b) || (c>d)));







    }
}
