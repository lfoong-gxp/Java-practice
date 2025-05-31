public class Pract_1_Car_Class {
    //Practice 1.
    //Objective:
    //Learn how to define classes and create objects.
    //Understand the role of constructors and instance variables.
    String make,model;
    int year;

    //Starting with the constructor
    public Pract_1_Car_Class(String make, String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    //Make an object to make it understandable
    public void displayInfo(){

        System.out.println("Car Make: "+ make);
        System.out.println("Car model: "+ model);
        System.out.println("Car Manufacture year: "+ year);

    }
    //Making an object to view
    public static void main(String[] args){
        Pract_1_Car_Class car_1 = new Pract_1_Car_Class("Toyota", "Supra", 1998);
        car_1.displayInfo();
    }

}