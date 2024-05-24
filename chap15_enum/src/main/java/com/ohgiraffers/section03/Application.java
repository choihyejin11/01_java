package main.java.com.ohgiraffers.section03;

import java.util.EnumSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {

        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin);   //출력값 ADMIN
        System.out.println(admin.getNameToLowerCase()); //출력값 admin


        UserRole2 consumer = UserRole2.CONSUMER;
        //ordinal은 번호
        System.out.println(consumer.ordinal() + "" + consumer.name() + "" + consumer.getDescription()); //출력값 1CONSUMER구매자

        UserRole2 consumer2 = UserRole2.CONSUMER;

        if(consumer2 == consumer){
            System.out.println("동일 비교 ");  //참이므로, 출력값은 동일 비교
        }

        //EumSet을 활용하여 여러 열거형 타입들을 set으로 취급할 수 있다.
        EnumSet<UserRole2> roles = EnumSet.allOf(UserRole2.class);

        //Iterator를 사용하면 반복문으로 쓸 수 있다.
        Iterator<UserRole2> iter = roles.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().name());
        }

        //특정 상수만 골라서 (EnumSet.of()) set에 추가할 수 있다.
        System.out.println("=====");
        EnumSet<UserRole2> roles2 = EnumSet.of(UserRole2.CONSUMER,UserRole2.PRODUCER);
        Iterator<UserRole2> iter2 = roles2.iterator();
        while(iter2.hasNext()){
            UserRole2 role = iter2.next();
            System.out.println(role.ordinal() + " " + role.getDescription());
        }

        //특정 상수를 골라서 제외하고 set에 추가할 수 있다
        System.out.println("=====");
        EnumSet<UserRole2> notGuest = EnumSet.complementOf(EnumSet.of(UserRole2.GUEST));
        Iterator<UserRole2> notGuestIter = notGuest.iterator();
        while(notGuestIter.hasNext()){
            UserRole2 role = notGuestIter.next();
            System.out.println(role.ordinal() + " " + role.getDescription());
        }






    }
}
