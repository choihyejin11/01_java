package main.java.com.ohgiraffers.section01.array;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        int[] iarray;
        int[] array;

        iarray = new int[5];
        array = new int [4];

        int[] iarr = new int[5];

        System.out.println(iarray);
        System.out.println(array);
        System.out.println(iarr);


        //hashCode(); 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.

        System.out.println(iarray.hashCode());
        System.out.println(array.hashCode());
        System.out.println(iarr.hashCode());

        //스캐너를 통해 입력 받은 정수로 배열 길이를 지정
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] darr = new int[size];

        System.out.println("darr의 hashcode : " + darr.hashCode());
        System.out.println("darr의 length :" + darr.length);

        darr = new int[50];

        System.out.println("바뀐 hashcode : " + darr.hashCode());
        System.out.println("바뀐 length : " + darr.length);


    }

}
