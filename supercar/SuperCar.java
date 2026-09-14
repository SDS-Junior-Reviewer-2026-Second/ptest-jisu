class SuperCar {

    private String carName;
    public SuperCar(String carName) { this.carName = carName; }
    void ride() {}
}

class Ferrari extends SuperCar {
    public Ferrari(){
        super("Ferrari");
    }

    @Override
    void ride() {
        System.out.println("Ferrari vroong");
    }
}

class Porsche extends SuperCar {
    public Porsche(){
        super("Porsche");
    }

    @Override
    void ride() {
        System.out.println("Porsche vroong vroong");
    }
}

class AvanteN extends SuperCar {
    public AvanteN(){
        super("AvanteN");
    }

    @Override
    void ride() {
        System.out.println("AvanteN vrrr");
    }
}
