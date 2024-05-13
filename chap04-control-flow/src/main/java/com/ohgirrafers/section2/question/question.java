package main.java.com.ohgirrafers.section2.question;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {


        /*
         * 입력한 숫자 범위내에서 소수를 찾아 출력하는 프로그램을 작성 해 봅시다.
         * 사용자로부터 시작 숫자와 끝 숫자를 입력 받습니다. 3 8
         * 프로그램은 해당 범위내에 존재하는 모두 소수를 출력합니다.
         * 소수 = 1과 자기 자신을 제외한 수로 나누어 떨어지지 않는 수
         * */

        // 숫자를 입력하세요 출력
        //첫번째 수와 마지막 수를 반복하도록 만든다.
        // 그 안에서 나누어 떨이지지 않는 수를 만든다.
        // 예) 3 8 입력하면 3,5,7 소수가 출력되도록... 2를 나눴을때 나머지가 0 이 아닌경우


        Scanner sc = new Scanner(System.in);
        // 숫자를 출력하세요
        System.out.println("첫번째 숫자를 입력하세요: ");
        int start = sc.nextInt(); // start는 첫번째 수

        System.out.println("두번째 숫자를 입력하세요: ");
        int end = sc.nextInt(); // end는 첫번째 수

        System.out.println(start + "부터" + end + "까지의 소수 : ");


        for (int i = start; i < end; i++) {

            boolean isTrue = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isTrue = false;
                    break;
                }
            }

            if (isTrue == true) {
                System.out.println(i + "");
            }
        }

    }

}
