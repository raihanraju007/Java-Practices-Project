package oop.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.acc();
//        car.start();
//        car.stop();
        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}
