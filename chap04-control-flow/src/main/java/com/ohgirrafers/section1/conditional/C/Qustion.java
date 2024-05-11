package main.java.com.ohgirrafers.section1.conditional.C;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Qustion {


    /*
    * a,b,c 세 과목의 점수를 스캐너를 입력 받고 세 과목의 점수를 만든
    * 메소드의 매개변수로 전달해 평균을 계산, 평균을 이용하여 합격/ 불합격 처리를 하는 기능 만들기
    * (합격 조건 : 세과목의 점수가 각각 40점을 넘어야하고, 평균은 60을 넘어야 함)
    * 합격 했을 경우 그 학생의 평균 점수와 "합격입니다" 출력
    * 불합격이면 "불합격" 출력
    *
    *
    * */

    /*
    * 스캐너 만들기
    * "a과목의 점수를 입력하세요" 입력받기
    * "b과목의 점수를 입력하세요" 입력받기
    * "c과목의 점수를 입력하세요" 입력받기
    *
    *  매개변수로 전달하기
    *
    *
    *  만약에 a,b,c 각 점수가 40점이 넘으면 합격, 그렇지 않으면 불합격
    *  평균 (a+b+c)/3   --> 만약 평균이 60점 이상이면 합격, 그렇지 않으면 불합격
    *
    *  a,b,c 점수가 40점 넘고 평균 60넘으면 합격
    *  그렇지 않으면 불합격
    *
    * */


 public void point (int a, int b, int c) {
     if(a<40){
         //불합격
         System.out.println("불합격입니다.");
     } else if(b<40){
         System.out.println("불합격입니다");
     } else if(c<40){
         System.out.println("불합격입니다");
     }else { //a,b,c 모두가 합격이면,
         if((a+b+c)/3 <60){    //평균을 했을때 60점 이하면
           //불합격
             System.out.println("평균미달로 불합격입니다");
         } else {     //평균이 60점 이상이면
             //합격
             System.out.println("점수와 평균이 모두 합격입니다");
         }
     }





     //평균구하기
 }



}
