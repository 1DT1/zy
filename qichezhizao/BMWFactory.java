package qichezhizao;

import huitugongju.CarFactory;

public class BMWFactory implements CarFactory {
    public Car produceCar(){
        Car car=new BMW();
        return car;
    }
}
