package main.java.com.ohgirrafers.section2.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printFromTwoNine(){
        //2단부터 단을 1단씩 증가시키는 반복문

        //1단씩 증가
        for(int dan =2; dan<10; dan++ ) //2단부터 9단까지 반복

        //연산해주기: 2부터 9까지 단에 곱해주기
            for(int su=1; su <10; su++){

                System.out.println(dan + "*" + su + " =" +  (dan*su));



            }


    }

    public void printFromThreeNine(){

        //2~9단 증가
        for(int dan =2; dan<10; dan++ ){
         printGugudan(dan);

            System.out.println(" ");

        }


        //단을 매개변수로 전달

    }
    public void printGugudan(int dan){

        for(int su=0; su <10; su++){
            System.out.println(dan + "*" + su + " =" +  (dan*su));
        }

    }

    public void printStars(){

        //키보드로 정수를 하나 입력 받아 해당 정수만큼 한 행에 "*"을 행의
        //번호개씩 출력하세요

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 줄 수를 입력해주세요: ");
        int row = sc.nextInt();

        //한줄당 행(row)에 해당하는 줄의 개수를 센다
        //출력할 행
        for (int i = 0; i < row; i++) {

            for (int j = 0; j <=i; j++) {
                System.out.print("*"); //println에서 ln은 뺀다. ln이 줄을 넘긴다는 의미
            }
            System.out.println();


        }

        //행의 숫자만큼 별을 출력



    }

}
