package main.java.com.ohgiraffers.section03.copy;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 배열의 복사는 크게 두가지.
        * 1. 얕은 복사(shadow copy) :stack의 주소값만 복사
        * 2. 깊은 복사(deep copy) : heap의 영역에 저장된 값을 복사
        *
        *
        * 얕은 복사는 atack에 저장되어 있는 배려의 주소값만 복사하다는 것.
        * 따라서 두개의 변수는 동일한 주소값을 가지고 있다.
        * 하나의 변수에 저장된 주소값을 가지고 배열의 배열을 수정하게 되면
        * 다른 배열에 접근했을 때도 동일한 배열을 자리키고 있기 매문에
        * 변경된 값이 반영되어있다.
        *
        * */

        int[] originArr = {1,2,3,4,5};
        int[] copyArr = originArr;

        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());

        for (int x : originArr) {
            System.out.println(x);
        }
        for (int x : originArr) {
            System.out.println(x);
        }
        copyArr[0] = 99; //copy 인덱스의 값을 바꿔도 원본의 값이 다 바뀜. 원본에 직접 접근

        for (int x : originArr) {
            System.out.println(x);
        }
        for (int x : originArr) {
            System.out.println(x);
        }
    }

}
