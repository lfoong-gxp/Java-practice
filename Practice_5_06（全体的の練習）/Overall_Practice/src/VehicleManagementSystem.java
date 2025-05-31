//Overall Practice （全体的の練習）

public class VehicleManagementSystem{
    public static void main(String [] args){
        Car car = new Car("Toyota", "Supra", 1998);
        car.setOwner("Lik Huan");
        car.setMileage(100);
        car.displayInfo();
        car.startEngine();
        car.performService();

        Bike bike = new Bike ("Honda", "Ninja", 2000);
        bike.calculateFuelEfficiency();
        bike.checkEngine();

        Vehicle v2 = new Bike("Honda", "CBR", 1998);
        v2.startEngine();
        v2.displayInfo();

        }
    }


class Vehicle{
    String make,model;
    int year;
    private String owner;
    private int mileage;

    //Constructor
    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    //Private field get method
    public String getOwner(){
        return owner;
    }
    public int getMileage(){
        return mileage;
    }
    //Private field set method
    public void setOwner(String owner){
        this.owner=owner;
    }
    public void setMileage(int mileage){
        this.mileage=mileage;
    }



    //Methods to display info, start/stop engine , calculate fuel efficiency

    public void displayInfo(){
        System.out.println("The make: "+ make);
        System.out.println("The model: "+ model);
        System.out.println("The year manufactured: "+ year);
        System.out.println("The owner is "+ owner);
        System.out.println("The mileage is "+ mileage);

    }
    public  void startEngine(){
        System.out.println("The engine has started!! ");
    }
    public void stopEngine(){
        System.out.println("The engine has stoped!! ");
    }
    public void calculateFuelEfficiency(){
        System.out.println("The fuel efficiency is calculating...");
    }


}

// Inheritance　（継承）

class Car extends Vehicle implements Serviceable{

    public Car (String make, String model, int year){
        super(make,model,year);

    }
    //Polymorphism
    @Override
    public void startEngine(){
        System.out.println("The Car Engine is running!! ");
    }

    @Override
    public void stopEngine(){
        System.out.println("The Car Engine has stopped running!! ");
    }

    @Override
    public void calculateFuelEfficiency(){
        System.out.println("The Fuel Efficiency is good!! ");
    }

    @Override
    public void performService(){
        System.out.println("The Car is being serviced");
    }

    @Override
    public void checkEngine(){
        System.out.println("The Car Engine is being serviced");
    }

}

class Bike extends Vehicle implements Serviceable{

    public Bike (String make, String model, int year){
        super(make,model,year);

    }
    //Polymorphism　（多態性）
    @Override
    public void startEngine(){
        System.out.println("The Bike Engine is running!! ");
    }

    @Override
    public void stopEngine(){
        System.out.println("The Bike Engine has stopped running!! ");
    }

    @Override
    public void calculateFuelEfficiency(){
        System.out.println("The Bike Fuel Efficiency is  super good!! ");
    }

    @Override
    public void performService(){
        System.out.println("The Bike is being serviced");
    }

    @Override
    public void checkEngine(){
        System.out.println("The Bike Engine is being serviced");
    }


}


