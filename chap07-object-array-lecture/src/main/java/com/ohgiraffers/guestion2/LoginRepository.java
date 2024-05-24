package main.java.com.ohgiraffers.guestion2;

public class LoginRepository {
   /*
     *  LoginRepository (등록기능)
         *  - 로그인 등록
         *  - 회원가입 등록
         *  - 회원 가입은 10명까지만 가능. 10명이 넘으면 유저가 꽉 찾습니다.
         *  - 등록된 회원이 없습니다.
         *  - if 유저들이 id와 userDTO.getid가 일치하고, pwd가 userDTO.getpwd가 같으면
         *   else "아이디 와 비밀번호가 일치하지 않습니다." ==> 이게 10번 반복 */

    private UserDTO[] users = new UserDTO[10];

    //users는 10명까지만 가능해
    private int count;
    public boolean join(UserDTO userDTO) {  //join이 뭐랑 연결되어있지??
        if (count < 10) {
          users[count++] = userDTO;
          return true;

        } else {
            System.out.println("유저가 꽉 찼습니다");
            return false;

        }
    }

// * if 유저들이 id와 (userDTO.getid)가 일치하고, pwd가 (userDTO.getpwd) 가 같으면
//   else "아이디 와 비밀번호가 일치하지 않습니다." ==> 이게 10번 반복 */
    public int login(UserDTO userDTO){
        if(users[0] ==null){
            System.out.println("등록된 회원이 없습니다");
            return 2;

        }

        for (int i = 0; i < count; i++) {
            if (users[i].getId() == userDTO.getId()) {
                if (users[i].getPwd() == userDTO.getPwd()){
                    return 0;

                }else{
                    System.out.println(" ");
                    break;
                }

            }else{
                System.out.println(" ");
                break;
            }
        }
        System.out.println("아이디나 비밀번호가 다릅니다");
        return 1;

    }


}
