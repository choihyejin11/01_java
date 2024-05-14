package main.java.com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private Car car = new Car();

    /*
     * this.car의 시동을 거는 메소드
     * */

    public void startUp() {
        car.startUp();

    }


    /*
     * this. car를 앞으로 가게 하는 메소드
     *
     *
     *
     * */

    public void stapAceletor() {
        car.go();

        /*
         * this.car 를 멈추는 메소드
         */

    }

    public void stopBreak() {
        car.stop();
    }

    public void trunoff() {
        car.stop();
    }

}
