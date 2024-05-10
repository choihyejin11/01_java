package main.java.com.ohgiraffers.section01.method;

public class Calculator {

    //둘 중 최소값을 리턴

    public int minNumberOf(int first, int second) {
        return (first > second)? second:first;
    }
    //둘 중 최대값을 리턴
    public static int maxNumberOf(int first, int second) {
        return (first > second)? first:second;  //static 이 있으면 컴퓨터가 메모리해둔 상태임
    }
}
