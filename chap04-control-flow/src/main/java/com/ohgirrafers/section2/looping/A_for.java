package main.java.com.ohgirrafers.section2.looping;

import java.util.Scanner;

public class A_for {

    public void testFor() {

        /*
        * [for 표현식]
        * for(초기식; 조건식; 증감식){
        *  조건을 만족하는 경우 수행할 구문(반복할 구문);
        * }
        *
        *
        *
        *
        * */

        //1부터 10까지 증가시키면서 출력될 기본 반복문

        for (int i=1; i<=10; i++){
            System.out.println(i);

        }
    }

    public void testFor2() {
        //10명의 학생 이름을 받아 출력해보자

        Scanner sc = new Scanner(System.in);

        System.out.println("1번째 학생 이름을 입력해주세요");
        String student1 = sc.nextLine();
        System.out.println("1번째 학생이름은 :" + student1 + "입니다");

        System.out.println("2번째 학생 이름을 입력해주세요");
        String student2 = sc.nextLine();
        System.out.println("2번째 학생이름은 :" + student1 + "입니다");

        System.out.println("3번째 학생 이름을 입력해주세요");
        String student3 = sc.nextLine();
        System.out.println("3번째 학생이름은 :" + student1 + "입니다");

        /*
        * 반복되는 부분 : 안내문구, 학생의 이름을 받는 부분, 이름 출력
        *
        * */

        for(int i=1; i<=10; i++){
            System.out.println(i + "번째 학생의 이름을 입력 해주세요");
            String student = sc.nextLine();
            System.out.println( i + " 번째 학생의 이름은" + student + "입니다.");
        }
    }

    public void testFor3() {
        //1~10까지의 합계를 구하시오

        int sum = 0;
        for (int i=1; i<=10; i++){
            sum += i;
        }
        System.out.println(sum);

        /*
        * 1씩 증가하는 값을 담기
        * sum 변수에 계속 누적시키기
        * 10번 반복하기
        * */


    }

    public void testFor4() {

        //숫자 두개를 입력받아 작은 수부터 큰수까지의 합계를 구한다.
        //1. 스캐너를 이용해서 숫자 두개 입력받는다.
        //2. a,b중 큰수 확인
        //3. 작은수를 초기식에 넣고 큰수가될때까지 반복

        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수 입력: ");
        int a = sc.nextInt();

        System.out.println("두번째 정수 입력: ");
        int b = sc.nextInt();

        int sum = 0;

        if (a>b) {

            for (int i = b; i <= a; i++ ){
                sum += i;

            }
        }
        System.out.println(sum);

    }

    public void testFor5() {
        //2~9사이의 값을 입력 받아
        //2~9사이의 값이 제대로 들어왔는지 해당 구구단 출력하고



   /* 5*1 = 5
      5*2 = 10
      5*3= 15 */


    Scanner  SCR = new Scanner(System.in);
    System.out.println("출력할 구구 수를 입력 입력해주세요: ");
    int dan = SCR.nextInt();



     if(dan >=2 && dan <=9){
     for(int i=1; i<=10; i++){
         System.out.println(dan + "*" + i + "=" + dan*i);
     }
     } else {
         System.out.println("반드시 2~9사이의 값을 입력 해주셔야 합니다. ");
     }



     }
}
