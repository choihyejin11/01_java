package main.java.com.ohgiraffers.section02.encapsulatuon.problem3;

import main.java.com.ohgiraffers.section02.encapsulatuon.problem3.Monster;

public class Application01 {
    public static void main(String[] args) {

        //몬스터 객체를 여러개 생성한다.

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp((200));

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄슈타인");
        monster2.setHp((200));

        Monster monster3 = new Monster();
        monster3.setInfo("늑대인간");
        monster3.setHp((300));

        System.out.println(monster1.getKinds());
        System.out.println(monster2.getKinds());
        System.out.println(monster3.getKinds());

    }
}
