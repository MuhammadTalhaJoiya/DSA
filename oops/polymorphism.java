import java.lang.reflect.Constructor;

// "Polymorphism has two main type,first is function overload and second is function overriding"
// "Function overloading"
class Car{
    Integer wheel;
    String color;
    Car(){
        this.wheel=wheel;
        this.color=color;
    }
    public void speed(Integer wheel){
        System.out.println("There are " + wheel + " in it ");
    }
    public void speed(String color){
        System.out.println("The color is " + color);
    }
    public void speed(Integer wheel,String color){
        System.out.println("There are " + wheel + " in it and color is " + color );
    }
}


public class polymorphism {

    public static void main(String arg[]){
        Car obj1=new Car();
        obj1.color="red";
        obj1.wheel=4;
        obj1.speed(132);
        obj1.speed("reds");
        obj1.speed(6,"blue" );
    }
}
