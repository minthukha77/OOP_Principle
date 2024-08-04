package DependencyInversion;

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

    Engine engine;
    public Car(Engine engine){
        this.engine = engine;
    }

    public void start(){
        System.out.println("Car start");
        this.engine.start();
    }
}

class OCP{

    public static void main(String[] args) {

        Engine engine = new Engine();
        Engine engine2 = new DiselEngine();

        Car car = new Car(engine);
        Car car2 = new Car(engine2);


        car.start();
        car2.start();
    }
}
