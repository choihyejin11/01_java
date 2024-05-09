package main.java.com.ohgiraffers.section05.logical;

import java.sql.SQLOutput;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 논리 연산자의 우선순위
        * && : 11순위
        * || : 12순위
        *
        *
        *
        * */

        int num1 = 55 ;
        /* 1<num1<100 불가*/
        System.out.println("1부터 100사이에 있는지 확인 : " + (num1 >= 1 && num1 <= 100));

        //영어 대문자 확인
        char ch1 = 'G' ;
        System.out.println("영어 대문자 확인:" + (ch1 >= 'A' && ch1 <= 'Z'));

        char ch2 = 'g' ;
        System.out.println("영어 대문자 확인 :" + (ch2 >= 'A' && ch2 <= 'Z'));

        //영문자 y 확인
        char ch3 = 'Y';
        char ch4 = 'y' ;
        System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));
        System.out.println("영문자 y인지 확인 : " + (ch4 == 'y' || ch4 == 'Y'));

        char ch5 = 'f' ;
//    System.out.println("영문자인지 확인 : " +((ch5 >= 'A' && ch5 <= 'Z')) || (ch5 >= 'a' && ch5 <= 'z'));







    }
}
