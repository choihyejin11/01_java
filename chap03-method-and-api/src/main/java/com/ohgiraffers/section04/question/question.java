package main.java.com.ohgiraffers.section04.question;

//import main.java.com.ohgiraffers.section04.Test;

import java.util.Random;

public class question {
    public static void main(String[] args) {
        /*
        * -100에서 100사이의 난수를 발생 시켜서 매개변수로 전달하면 (0은 고려안함)
        * 매개변수가 양수면서 짝수면 x는 양수면서 짝수입니다. 양수면서 홀수면 양수면서 홀수입니다.
        * 음수면서 짝수면 x는 음수면서 짝수입니다. 홀수면 음수면서 홀수입니다.
        * 를 반환하는 메소드를 복습을 위해 다른 패키지에 클래스는 생성해 임포트 시킨 후 메인 메소드에 출력해보자
        *
        *
        * 삼항연산자와 임포트로 구성
        *
        * 코드부터 작성하고 완료되면 다른 사람이 알기 쉬는 내용으로 풀어서 전달하자.
        * */


        Random random = new Random();

        //-100부터 100까지의 난수 발생
        int randomNumber = random.nextInt(200);
        System.out.println("-100부터 100까지의 난수: " + randomNumber);



        //메소드로 보낸다음에..
        //static 메소드인 경우
        String a = Test.newNumber(randomNumber);
        System.out.println(a);






    }
}
