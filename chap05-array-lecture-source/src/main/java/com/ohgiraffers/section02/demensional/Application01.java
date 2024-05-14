package main.java.com.ohgiraffers.section02.demensional;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 다차원 배열은 2차원 이상의 배열을 의미한다.
        * 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다.
        * 즉, 2차원 배열은 1차원 배열 여러개를 하나로 묶어서 관리하는 배열을 의미한다.
        * 더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열 사용.
        *
        * */

        /*
        * 사용하는 방법
        * 1. 배열의 주소를 보관할 래퍼런스 변수를 선언
        * 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성
        * 3. 각 인덱스에서 관리하는 배열을 할당하여 주소를 보관하는 배열에 저장
        * 4. 생성한 여러 개의 1차원에 배열에 차례로 접근해서 사용
        * */


        int[][] iarr1;
        int jarr2[][];
        int[] jarr3[];

        iarr1 = new int[3][]; //처음에만 길이 정해주면 된다.
//        jarr2 = new int[][]; //에러
//        jarr3 = new int[][3]; //에러

        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];

//        iarr2 = new int[3][5]; //위의 내용과 같다는 뜻



        for (int i = 0; i < iarr1[0].length;i++) {
            System.out.println(iarr1[0][i] + " ");
        }
        for (int i = 0; i < iarr1[0].length;i++) {
            System.out.println(iarr1[1][i] + " ");
        }
        for (int i = 0; i < iarr1[0].length;i++) {
            for (int j = 0; j < iarr1[1].length;j++) {
                System.out.println(iarr1[i][j] + "");
            }
        }

    }
}
