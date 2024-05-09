package main.java.com.ohgiraffers.section05.typecasting;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 데이터 형 변환
        * 자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        * 즉, 같은 데이터 타입끼리만 연산 수행
        *
         */

        /*
        * 형 변환의 종류와 규칙
        * 1. 자료형 변환 - 컴파일러가 자동으로 수행해주는 타입 변환
        * 1-1. 작은 자료형에서 큰 자료형으로 자동형 반환된다.
        * 1-2. 정수는 실수로 자동형 반환된다.
        * 1-3/ 문자형은 int형으로 자동형 반환된다.
        * 1-4. 논리형은 형변환 규칙에서 제외
        * 2. 강제 형변환- 형변환 cast 연산자를 이용한 강제적으로 수행하는 형변환
         */

        //1-1 정수끼리의 형변환
        byte bnum = 1;
        short snum = bnum; //바이트에서 쇼트로 자동형변환
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2= 20l;

        long result = num1 + num2;
//        int result = num1 + num2; //에러. 작은데로 합쳐질수는 없다.

        //1-2 정수와 실수의 형 변환
        long  eight = 8l ;
        float four = eight ;
        System.out.println(four);

        float results3 = eight + four ;
        System.out.println(results3);

        char ch1 = 'a';
        int charNumber = 97;

        char chValue = (char)charNumber;
        System.out.println(chValue);
        System.out.println((int)ch1);
        System.out.println((char)charNumber);

        char ch2 = 65;
        System.out.println(ch2);

        //논리형 형변환 규칙에서 제외된다.
        boolean isTrue = false;
//        byte b = isTrue; 이렇게 안됨












    }
}
