package main.java.com.ohgiraffers.section04.question;

public class Test {



    /*
     * -100에서 100사이의 난수를 발생 시켜서 매개변수로 전달하면 (0은 고려안함)
     * 매개변수가 양수면서 짝수면 x는 양수면서 짝수입니다. 양수면서 홀수면 양수면서 홀수입니다.
     * 음수면서 짝수면 x는 음수면서 짝수입니다. 홀수면 음수면서 홀수입니다.
     * 를 반환하는 메소드를 복습을 위해 다른 패키지에 클래스는 생성해 임포트 시킨 후 메인 메소드에 출력해보자
     *
     * */

    //매개변수가 +이고, 2를 나누었을때 0 이면 ==> 짝수출력 , 그렇지 않으면 홀수출력


     public static String newNumber(int randomNumber) {
         String x = (randomNumber > 0)? (randomNumber % 2 == 0)? randomNumber+"는 짝수" : randomNumber+"는 홀수" :  (randomNumber % 2 == 0)? randomNumber + "는 짝수" : randomNumber + "는 홀수";
         return  x;
     }



}
