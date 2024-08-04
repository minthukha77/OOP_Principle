package DependencyInjection;

class Engine {

    void start(){
        System.out.println("Engine start");
    }
    
}

class DiselEngine extends Engine{

    void start(){
        System.out.println("DiselEngine start");
    }

}


class GasEngine extends Engine{

    void start(){
        System.out.println("GasEngine start");
    }

}


class Car{

    Engine engine = new Engine();

    public void start(){
        System.out.println("Car start");
        this.engine.start();
    }
}

class OCP{

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
