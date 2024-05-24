package main.java.com.ohgiraffers.guestion2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
         *  사용자 로그인 및 회원가입 시스템을 스캐너를 이용해 객체지향 적으로 구현해보자.
         *
         *  - 회원 가입은 10명까지만 가능
         *  - 가입한 회원이 없는 상태에서 로그인을 시도하면  - 가입한 회원이 없습니다. 출력
         *  - 정상적으로 가입 후 로그인시 로그인 완료 출력된 후 프로그램 종료
         *  - 스캐너로 아이디, 이름, 비밀번호, 비밀번호 확인 을 물어본 후 비밀번호와 비밀번호 확인이 같을 시 가입 진행
         *
         *
         *   User (데이터/DTO)
         *  - 회원의 id, pwd, name 을 받을 DTO
         *
         *
         *  LoginService (입력기능)
         *  - 회원 가입, 로그인 메소드 연결
         *  - DTO를 불러와서..
         *  - 회원가입 : 아이디를 입력해주세요 / 이름을 입력해주세요
         *              비밀번호를 입력해주세요 / 비밀번호 한번 더 입력해주세요
         *  - 로그인 : 아이디를 입력해주세요 / 비밀번호를 입력해주세요
         *            UserDTO가 맞으면 로그인되었습니다. 그렇지 않으면 비밀번호가 다릅니다
         *
         *  LoginRepository (등록기능)
         *  - 회원 가입 등록, 로그인 등록 ison
         *  - 회원 가입은 10명까지만 가능. 10명이 넘으면 유저가 꽉 찾습니다.
         *  - 등록된 회원이 없습니다.
         *  - 아이디와 비밀번호가 일치하지 않습니다.
         *
         *
         *  Application (실행기능)
         *  - 정상적으로 가입 후 로그인시 로그인 완료 출력된 후 프로그램 종료
         *  - 스캐너로 아이디, 이름, 비밀번호, 비밀번호 확인 을 물어본 후 비밀번호와 비밀번호 확인이 같을
         *  - 스캐너로 int로 입력받는다.
         *
         * -
         *  - 1. 로그인되었습니다.
         *  - 2. 회원가입 되었습니다.
         *  - 3. 프로그램 종료되었습니다.

         *
         * */


        Scanner sc = new Scanner(System.in);
        LoginService loginService = new LoginService();

        while (true) {
            System.out.println("== 로그인 및 회원가입 프로그램==");
            System.out.println("1.로그인");
            System.out.println("2. 회원가입");
            System.out.println("9. 회원프로그램 종료");
            int choice = sc.nextInt();

            switch (choice) {

                //1번이면 로그인서비스.로그인으로 가고, 그렇지 않으면 break
                case 1:
                    int ison = loginService.login();
                    if (ison == 1) {
                        return;
                    } else {
                        break;
                    }
                    //2번이면 로그인서비스.회원가입으로 가
                case 2:
                    loginService.signUp();
                    break;
                //9번이면 프로그램종료
                case 9:
                    System.out.println("프로그램을 종료합니다");
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다");
                    break;
            }

        }




    }
}
