public class Person {
    private SuperCar car;
    void buyCar(SuperCar car){
        this.car = car;
    }

    void driving(){
        car.ride();
    }
}
