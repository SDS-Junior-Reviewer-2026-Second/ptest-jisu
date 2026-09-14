public class Main {
    public static void main(String[] args) {

        SuperCar car1 = new Ferrari();
        SuperCar car2 = new Porsche();
        SuperCar car3 = new AvanteN();

        Person p1 = new Person();
        p1.buyCar(car1);

        Person p2 = new Person();
        p2.buyCar(car2);

        Person p3 = new Person();
        p3.buyCar(car3);

        p1.driving();
        p2.driving();
        p3.driving();
    }
}
