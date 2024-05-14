package main.java.com.ohgiraffers.section03.copy;

public class Application02 {
    public static void main(String[] args) {

        //얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다.

        String[] names = {"홍길동","유관순","이순신"};
        System.out.println("hashcode : " + names.hashCode());
        print(names);

        String [] animals = getAnimals();

        System.out.println(animals.hashCode());
        print(animals);
        print(getAnimals());
    }
    public static void print(String[] names){
        System.out.println(names.hashCode());

    }

    public static String[] getAnimals(){
        String[] animals = {"호랑이", "돼지", "낙타"};

        System.out.println(animals.hashCode());

        return animals;
    } //void가 없으므로 return 표기
}
