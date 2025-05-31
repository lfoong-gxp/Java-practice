//Practice 2.Methods and Return Types　（メソッドとreturn)

public class Pract_2_Rectangle_Objects
{
    double length,width;

    //Method to make each length and width
    public Pract_2_Rectangle_Objects(double length, double width){
        this.length= length;
        this.width=width;
    }

    //Display the width,length,area,perimeter
    public void displayInfo(){
        System.out.println("This is the length " + length);
        System.out.println("This is the width " + width);
        double area= length*width;
        System.out.println("This is the area "+ area);
        double perimeter= length*2 + width*2;
        System.out.println("This is the perimeter "+ perimeter);
    }

    public static void main(String[] args){
        Pract_2_Rectangle_Objects rectangle_1 = new Pract_2_Rectangle_Objects(12,13);
        rectangle_1.displayInfo();
    }

}