package main.java.com.ohgiraffers.section03.math;

import java.util.Random;

public class Application01 {
    public static void main(String[] args) {

        /*
        * api란?
        * Application programming interface 는 응용 프로그램에서 사용할 수 있도록,
        * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
        * 쉽게 말해, 우리가 구현할 수 없거나 구현하기 번거로운 기능들을 jdk를 설치하면 자동으로 사용할 수 있도록
        * 제공해 놓은 소스코드 들을 의미한다.
        * 더 쉽게 말해 누가 작성해 놓은 소스 코드들을 가져다 쓰는 방법을 본다는 말이다.
        * 모든 코드를 개발자들이 다 외울 수 없기 떄문에 api문서를 별도로 제공해주고 있다.
        *
        * Math 기능 찾아보기 =====================
        *
        * */


        /*
        * java.lang.Math
        * Math 클래스는 수학에서 자주 사용되는 상수들과 함수 들을 미리 구현해 놓은 클래스이다.
        * 모든 메소드는 static 메소드로 정의되어있다.
        *         *
        * */


        System.out.println("-7의 절대값: " + (java.lang.Math.abs(-7)));

        //import를 사용해서 사용하기
        System.out.println("-1.25의 절대값 : " + (Math.abs(-1.25)));
        System.out.println("10과 20중 더 작은 값은?" + (Math.min(10,20)));
        System.out.println("10과 20중 더 큰 값은?" + (Math.max(10,20)));

        System.out.println("원주율" + (Math.PI));

        //난수 발생 (랜덤수)
        System.out.println("난수 발생:" + (int)(Math.random()*10)); //첫번째방법. 더블형식으로 나오기때문에 int로 형변환해준거임

        Random random = new Random();
        int randomInt = random.nextInt(10);
        System.out.println("난수발생2 :" + randomInt);   //두번째방법.

        //-128~127 사이의 난수를 발생시키기.
        int randomInt2 = new Random().nextInt(256)-128;



    }
}
