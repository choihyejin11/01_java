package main.java.com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args) {

        /*
        * 여러개의 전달인자를 이용한 메소드 호출 테스트
        *
        * */

        Application04 app4 = new Application04();
        app4.testMethod("홍길동",20,'남'); //매개변수는 순서대로 보내야한다.

        //변수에 저장된 값을 전달하여 호출할 수 있다.
        String name = "유관순";
        int age = 20;
        char gender = '여';
        app4.testMethod(name,age,gender);
    }

    /**
     * 이름과 나이와 성별을 전달 받아 한번에 출력해주는 기능을 제공
     *
     * @param name 출력할 이름을 전달해주세요
     * @param age 출력할 나이를 전달해주세요
     * @param gender 출력할 성별을 전달해주세요. 성별은 변경되지 않습니다.
     * */
    public void testMethod(String name, int age, final char gender){

        /*name = "홍길동";
        age = 20;
        gender = 's'; // final 키워드 붙은거는 재할당불가 */

        System.out.println("당신의 이름은" + name + "이고," + "나이는" + age +
                "성별은" + gender);

    }
}
