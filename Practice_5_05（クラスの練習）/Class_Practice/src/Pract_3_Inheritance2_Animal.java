//Inheritance practice 2　（継承）

import javax.xml.namespace.QName;

//Driving class
public class Pract_3_Inheritance2_Animal {
    public static void main(String[] args){
        Dog dog = new Dog("Jack", 12,"Chihuahua");
        dog.speak();
    }

}

//Parent Class
class Animal{
    String name;
    int age;

    public Animal(String name,int age){
        this.name= name;
        this.age = age;
    }

    public void speak(){
        System.out.println("Animal is making a sound!! ");
    }
}

//Inheritor/Child Class　
class Dog extends Animal{
    String breed;

    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed= breed;
    }

    @Override
    public void speak(){

        System.out.println("The Dog is Barking");
    }
}