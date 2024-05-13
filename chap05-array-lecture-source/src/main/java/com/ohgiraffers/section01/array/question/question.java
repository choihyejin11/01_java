package main.java.com.ohgiraffers.section01.array.question;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        //배열의 최소값, 최대값 찾기

        //배열 길이는 스캐너로 입력 받아서 요소마다 점수를 넣어줌
        //해당 배열의 최소값과 최대값을 출력해주는 기능을 만들어주세요.


   //스캐너로 입력받는다. 배열의 길이를.
   Scanner sc = new Scanner(System.in);

   System.out.println("배열의 길이는: ");
   int n = sc.nextInt();

   //배열을 만든다
   int[] darr1 = new int[n];
   System.out.println("darr1의 length :" + darr1.length);

   //각 인덱스마다 반복문으로 접근해 값 넣어준다.
   for(int i=0; i<n; i++){
       darr1[i] = sc.nextInt();

//       System.out.println(darr1[i]);
   }
  //min, max 변수를 생성한다.
   int min = darr1[0];
   int max = darr1[0];

   //반복문 안에 조건문을 넣어서 큰 값 혹은 작은 값만 남긴다.
   for(int i=0; i<n; i++){
       if(darr1[i] < min){
           min = darr1[i];
       }
       if(darr1[i] > max){
           max = darr1[i];
       }
   }
        System.out.println("최소값은" + min);
        System.out.println("최대값은" + max);






    }
}
