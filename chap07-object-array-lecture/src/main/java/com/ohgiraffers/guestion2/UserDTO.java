package main.java.com.ohgiraffers.guestion2;

public class UserDTO {
    /*
    User (데이터/DTO)
    - 회원의 id, pwd, name 을 받을 DTO
    */

    //필드
   private String name;
   private String id;
   private String pwd;

    //기본생성자
    public UserDTO() {
    }

    //name/id/pwd 생성자 (회원가입)
    public UserDTO(String name, String id, String pwd) {
        this.name = name;
        this.id = id;
        this.pwd = pwd;
    }

    //id/pwd 생성자 (로그인)
    public UserDTO(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override  //toString
    public String toString() {
        return "UserDTO [name=" + name + ", id=" + id + ", pwd=" + pwd + "]";
    }



}
