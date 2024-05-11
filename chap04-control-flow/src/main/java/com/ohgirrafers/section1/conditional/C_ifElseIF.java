package main.java.com.ohgirrafers.section1.conditional;

import java.util.Scanner;

public class C_ifElseIF {
    public void test3() {


        /*
         *
         * [if-else-if] 조건식
         * if(){
         * }else if(){}
         * else{}
         * */


        //금도끼 은도끼 에서 어떤 도끼가 나무꾼의 도끼인지를 물어보는 코드

        Scanner sc = new Scanner(System.in);
        System.out.println("어느 도끼가 너의 도끼냐(1. 금도끼, 2. 은도끼, 3.쇠도끼");
        int num = sc.nextInt();


        if (num == 1) {
            System.out.println("금도끼이다");
        } else if (num == 2) {
            System.out.println("은도끼이다");

        } else if (num == 3) {
            System.out.println("쇠도끼이다");
        } else {
            System.out.println("아무것도 아니네 ");
        }
        System.out.println("??");
    }

    public void test4() {
        /*
         * orgirrafers 대학의 교수님은 학생들의 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용한다.
         * 90점 이상이면 'A' 80점 이상이면 'B' 70점 이상이면 'C' 60점 이상이면 'D'
         * 60점 미만이면 'F'
         * 추가로 각 등급의 중간점수(95,85,75,65)를 넘는 경우는 '+'를 붙여서 세분화 하다보니 신경쓸게 많다.
         * 그래서 학생 이름과 점수 입력하면 자동으로 학점 등급 계산되는 프로그램 만들자.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("학생이름 입력하세요:  ");
        String name = sc.nextLine(); //이름으로 받으니 Sting 타입으로 nextLine을 받는다.
        System.out.println("점수를 입력하세요: ");
        int point = sc.nextInt();

        String grade = "";

        if (point >= 90) {
            grade = "A";
            if (point >= 95) {
                grade += "+";
            }
        } else if (point >= 80) {
            grade = "B";
            if (point >= 85) {
                grade += "+";
            }

        } else if (point >= 70) {
            grade = "C";
            if (point >= 75) {
                grade += "+";
            }
        } else if (point >= 60) {
            grade = "D";
            if (point >= 65) {
                grade += "+";
            }

        } else {
            grade = "F";
        }

        if (grade.equals("F")) {
            System.out.println(name + "재수강하세요");

        } else {
            System.out.println(name + "학생점수는" + point + "점 이고" + grade + "입니다");
        }
    }
}




