package main.java.com.ohgiraffers.section01.array.question;

import java.util.Scanner;

public class questionEx {
    public static void main(String[] args) {
        //값의 두번째로 큰 최소값 찾기
        //값의 두번째로 큰 최대값 찾기


        //스캐너로 숫자를 입력받을 내용을 만든다. scanner
        //배열방을 만든다. array[]
        //빈 배열방에 입력하는 아무값을 넣어준다.. for
        //만약 들어오는 값(3)이 이전에 들어오는 값(2)보다 크면(최대값) 출력하기
        //만약 들어오는 값(3)이 이전에 들어오는 값(2)보다 작으면(최소값) 출력하기

        //두번째 큰 최대값 구하기 예)1-5까지면 4이 출력되도록..
        //for (0,1,2,3,4) {if (들어오는 값이 최대값(5)보다 작으면){
        // 그중에서 가장 큰 최대값(max)}}

        System.out.println("=====go=====");

        //1. 스캐너로 숫자를 입력받을 내용을 만든다.
        Scanner sc = new Scanner(System.in);

        System.out.println("몇개 길이의 방을 만들까요?");
        int n = sc.nextInt();

        //2. 각자 배열방을 만든다. array
        int[] arr = new int[n];

        //3. 빈 배열방에 입력받은 숫자를 넣어준다.
        //방마다 값을 넣어주는 반복... for
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();    //int[i]로 넣으면 안되나?

            System.out.println(arr[i]);
        }

        //4. 방마다 값을 넣어준걸 한번씩 돌려준다(for)
        //5. 최대값 최소값 출력한다. min , max로 선언한다.

        int min = arr[0];
        int max = arr[0];
        int secondNumMax = arr[0]; // 6-1. 두번째 숫자 초기화

        for (int i = 0; i < n; i++) {
            // 5-1. 만약 들어오는 값(3)이 이전에 들어오는 값(2)보다 크면(최대값) 출력한다.
            if (arr[i] < min) {
                min = arr[i];

            }
            // 5-2. 만약 들어오는 값(3)이 이전에 들어오는 값(2)보다 크면(최대값) 출력한다.
            if (arr[i] > max) {
                secondNumMax = max; //새로운 최대값이 발견되면 secondNumMax를 업데이트
                max = arr[i];
            }

            //6. 두번째로 큰 수
            //6-2. arr[i]가 max보다 크지 않고 , arr[i]가 secondNumMax보다 클 경우 secondNumMax에 들어감
            else if (arr[i] > secondNumMax) {
                secondNumMax = arr[i];
            }


        }

        System.out.println("최소값은 : " + min);
        System.out.println("최대값은 :" + max);

        System.out.println("두번째로 큰 값은 :" + secondNumMax);

    }
}

