import java.util.stream.Gatherer.Integrator;
// Single Level Inheritance
// class Car{
//     String color;
//     Integer wheel;
//     Integer engine;
// }
// class Civic extends Car{
    
// }
// public class Inheritance {
//     public static void main(String arg[]){
//         Car obj1=new Car();
//         Civic obj2=new Civic();
//         obj2.color="blue";
//     }
// }
// Multilevel Inheritance
// class Car{
//     String color;
//     Integer wheel;
//     Integer engine;
// }
// class Civic extends Car{
//     public void func(){
//         System.out.println("I am sub class 1");
//     }
// }
// class Corolla extends Civic{
//     public void func(){
//         System.out.println("I am sub class 2");
//     }
// }
// public class Inheritance {
//     public static void main(String arg[]){
//         Car obj1=new Car();
//         Civic obj2=new Civic();
//         obj2.color="blue";
//     }
// }



// Hirarchial Inheritance
class Car{
    String color;
    Integer wheel;
    Integer engine;
}
class Civic extends Car{
    public void func(){
        System.out.println("I am sub class 1");
    }
}
class Corolla extends Car{
    public void func(){
        System.out.println("I am sub class 2");
    }
}
public class Inheritance {
    public static void main(String arg[]){
        Car obj1=new Car();
        Civic obj2=new Civic();
        obj2.color="blue";
    }
}