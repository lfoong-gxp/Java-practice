//Inheritance practice

class Bike {
    int speed,gear;
    /*    public static void main(String[] args){
            Bike bike_1 = new Bike(10,3);
            bike_1.displayInfo();
            bike_1.speedUp(10);
            bike_1.speedDown(10);
        }*/
    public Bike(int speed, int gear){
        this.speed=speed;
        this.gear=gear;

    }

    public int speedUp(int increament){
        System.out.println("Bike is speeding up by "+ increament);
        System.out.println("Current speed is " + (speed+increament));
        return increament;
    }

    public int speedDown(int decreament){
        System.out.println("Bike is slowing down by "+ decreament);
        System.out.println("Current speed is "+ (speed-decreament));
        return decreament;
    }

    public void displayInfo(){
        System.out.println("Speed is "+ speed);
        System.out.println("Gear is "+ gear);

    }

}

class MountainBike extends Bike{
    int seatHeight;

    public MountainBike(int speed, int gear, int startHeight){
        super (speed,gear);
        seatHeight= startHeight;

    }

    public void setHeight(int newValue){
        seatHeight= newValue;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Height is " + seatHeight);
    }


}

public class Pract_3_Bike_Inheritance{
    public static void main(String[] args){
        MountainBike mb = new MountainBike(40,3,25);
        mb.displayInfo();
        mb.setHeight(20);
    }
}