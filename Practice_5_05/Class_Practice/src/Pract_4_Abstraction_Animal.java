//Abstraction practice

class Animal{
    String name;
    int age;

    public Animal(String name,int age){
        this.name= name;
        this.age = age;
    }

    public void speak(){
    }
}

class Cat extends Animal{

    public Cat(String name,int age){
        super(name,age);
    }

    @Override
    public void speak(){
        super.speak();
        System.out.println("Meow");
    }
}

class Dog extends Animal{
    public Dog (String name, int age){
        super(name,age);
    }
    @Override
    public void speak(){
        super.speak();
        System.out.println("Bark");
    }
}

public class Pract_4_Abstraction_Animal{
    public static void main(String [] args){
        Dog dog = new Dog("Jack",12);
        Cat cat = new Cat("John", 10);

        dog.speak();
        cat.speak();
    }
}