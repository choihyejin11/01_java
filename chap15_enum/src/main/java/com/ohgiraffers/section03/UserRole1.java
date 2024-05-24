package main.java.com.ohgiraffers.section03;

public enum UserRole1 {
    GUEST,
    CONSUMER,
    PRODUCER,
    ADMIN;

    //생성자 만든다고 해서 새로운 인스턴스가 생기는게 아니다.
    //따라서 생성자를 가질 수 있으나 외부에서 호출할 수 없다.

    UserRole1() {
    }

    public String getNameToLowerCase(){
        return this.name().toLowerCase();

    }

}
