package main.java.com.ohgiraffers.section02.encapsulatuon.problem4;

import main.java.com.ohgiraffers.section02.encapsulatuon.problem4.Monster;

public class Application01 {
    public static void main(String[] args) {

        Monster monster1 = new Monster();
//        monster1.kinds = "프랑켄슈타인"; 접근할 수 없다. 에러
//        monster1.hp = 200 ; 접근할수없다. 에러

        /*
        * 선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
        * public 으로 접근을 허용한 메소드만 이용할 수 있도록 해 놓은 것이다.
        * 이것을 캡슐화 라고 부른다. 
        *
        * */

        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());
    }

}
