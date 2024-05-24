package main.java.com.ohgiraffers.guestion2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LoginService {
    /*LoginService (입력기능)
         *  - 회원 가입, 로그인 메소드 연결
         *  - DTO를 불러와서..
         *  - 회원가입 : 아이디를 입력해주세요 / 이름을 입력해주세요
         *              비밀번호를 입력해주세요 / 비밀번호 한번 더 입력해주세요
         *  - 로그인 : 아이디를 입력해주세요 / 비밀번호를 입력해주세요
         *            UserDTO가 맞으면 로그인되었습니다. 그렇지 않으면 비밀번호가 다릅니다*/

    //Application 이어짐
    //ison , login, signUp

    //스캐너
    Scanner sc = new Scanner(System.in);

    LoginRepository repo = new LoginRepository();

    //로그인(login) 메서드 만들기
    public int login() {
        System.out.println("아이디를 입력해주세요");
        String id = sc.nextLine();

        System.out.println("비밀번호를 입력해주세요");
        String pwd = sc.nextLine();

        UserDTO userDTO = new UserDTO(id, pwd);
        int isTrue = repo.login(userDTO);
        if (isTrue == 0) {
            System.out.println("로그인 완료 되었습니다");
            return 1;
        } else {
            return 2;
        }

    }
    //회원가입(signUp) 메서드 만들기
     public void signUp(){
         System.out.println("--회원가입--");

         System.out.println("아이디를 입력해주세요");
         String id = sc.nextLine();

         System.out.println("이름을 입력해주세요");
         String name = sc.nextLine();

         while(true) {
             System.out.println("비밀번호를 입력해주세요");
             String pwd = sc.nextLine();

             System.out.println("비밀번호를 한번 더 입력해주세요");
             String confirmPwd = sc.nextLine();
             if (pwd.equals(confirmPwd)) {
                 UserDTO userDTO = new UserDTO(id, pwd, name);
                 System.out.println("등록 완료 되었습니다.");
             } else {
                 System.out.println("비밀번호가 서로 다릅니다.");
             }


         }
     }





}
