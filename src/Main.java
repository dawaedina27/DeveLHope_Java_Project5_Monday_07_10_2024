


//Car <Interface>
//-> FourDoorCar <Abstract Class>
//->->FourDoorToyota <Class>
//->->FourDoorBMW <Class>
//->->FourDoorFord<Class>
//->->FourDoorHyundai <Class>
//-> TwoDoorCar <Abstract Class>
//->->TwoDoorToyota <Class>
//->->TwoDoorBMW <Class>
//->->TwoDoorFord <Class>
//->->TwoDoorHyundai <Class>



public class Main {
    public static void main(String[] args) {

        FourDoorCar car1 = new CarTest("dawaXM","dawa1",10000000,200,50);

        FourDoorBMW Car2 = new FourDoorBMW("Nisan","Doublex", 20000000, 120, 60 );
        FourDoorToyota Car3 = new FourDoorToyota("ABC", "UUU", 30000000, 100, 71);
        FourDoorHyundai Car4 = new FourDoorHyundai("JJ", "V8", 90000000, 100, 94);


        car1.start();
        car1.accelerate();
        car1.accelerate();
        car1.brake();
        car1.stop();


    }
}


interface Car {
    public void start();

    public void stop();

    public void accelerate();

    public void brake();

}

abstract class FourDoorCar implements Car{
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;
    public FourDoorCar(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        speed = 0;
    }
    @Override
    public void start() {
        speed = 0;
        System.out.println(name+" Starting "+ speed + " speed");
    }
    @Override
    public void stop() {
        speed = 0;
        System.out.println(name+" Stopping "+ speed+" speed");
    }
    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(name+" Accelerating "+ speed+" speed");
    }

    @Override
    public void brake() {
        if(speed > 0){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(name+" Braking "+ speed+" speed");
    }
    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }
}
abstract class TwoDoorCar implements Car{
    String model;
    String name;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;
    public TwoDoorCar(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        speed = 0;
    }
    @Override
    public void start() {
        speed = 0;
        System.out.println(name+" Starting "+ speed + " speed");
    }
    @Override
    public void stop() {
        speed = 0;
        System.out.println(name+" Stopping "+ speed+" speed");
    }
    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(name+" Accelerating "+ speed+" speed");
    }

    @Override
    public void brake() {
        if(speed > 0){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(name+" Braking "+ speed+" speed");
    }
    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }
}

class CarTest extends  FourDoorCar{
    public CarTest(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }
}

//Create FourDoorToyota, FourDoorBMW,  FourDoorFord, FourDoorHyundai classes, inherited from FourDoorCar.
//
//Implement necessary functions and write constructor.

//Create FourDoorBMW,

class FourDoorBMW extends FourDoorCar{

    public FourDoorBMW(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("FourDoorBMW is starting/running with " + speed + "speed");
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("FourDoorBMW is accelerating to " + speed + "speed");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("FourDoorBMW is brakeing to " + speed + "speed");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("FourDoorBMW has stopped");
    }

    //Create FourDoorFord

    class FourDoorFord extends FourDoorCar{

        public FourDoorFord(String model, String name, double price, double maxSpeed, double fuelCapacity) {
            super(model, name, price, maxSpeed, fuelCapacity);
        }

        @Override
        public void start() {
            super.start();
            System.out.println("FourDoorFord is starting/running with " + speed + "speed");
        }

        @Override
        public void accelerate() {
            super.accelerate();
            System.out.println("FourDoorFord is accelerating to " + speed + "speed");
        }

        @Override
        public void brake() {
            super.brake();
            System.out.println("FourDoorFord is brakeing to " + speed + "speed");
        }

        @Override
        public void stop() {
            super.stop();
            System.out.println("FourDoorFord has stopped");
        }
    }

}

//Create FourDoorHyundai
class FourDoorHyundai extends FourDoorCar{

    public FourDoorHyundai(String model, String name, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, price, maxSpeed, fuelCapacity);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("FourDoorHyundai is starting/running with " + speed + "speed");
    }



    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("FourDoorHyundai is accelerating to " + speed + "speed");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("FourDoorHyundai is brakeing to " + speed + "speed");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println("FourDoorFord has stopped");
    }
}







