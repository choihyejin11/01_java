package main.java.com.ohgiraffers.section01.arithmetic;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 산술 연산자
        * 산술 연산자는 주로 사칙연산과 관련된 연산자로 ,
        * 가장 기본적이면서 가장 많이 사용되는 연산자
        * 연산의 실행이 가능하기 위해 필요한 값이나 변수가 두개인 이항 연
        * 산자로 분류되며
        * 피연산자들의 방향은 왼쪽에서 오른쪽. (산수와 같다.)
        *
        * */

        int num1 = 20;
        int num2 = 7;
//왼쪽에서 오른쪽으로 이동할때 문자열로 인식해서 207이 됨
        System.out.println("num1+num2:"+num1+num2);   //207
        System.out.println("num1+num2:"+(num1+num2)); //괄호연산이 먼저 실행되서 27이 됨
//        System.out.println("num1-num2="+num1-num2); 에러
        System.out.println("num1*num2 ="+num1*num2);   //정수와 정수를 먼저 연산하고 문자열을 계산하므로 형변환이 일어나지 않는다
        System.out.println("num1/num2 ="+num1/num2);





    }
}
