// abstract class Animal{
//     abstract void Eat();
//     public static void func1(){
//         System.out.println("I am base class");
//     }
// }
// class Horse extends Animal{
//     public void Eat(){
//         System.out.println("I am horse,subclass");
//     }
// }
// class Camel extends Animal{
//     public void Eat(){
//         System.out.println("I am camel,subclass");
//     }
// }

// class abstraction{
//     public static void main(String arg[]){
//         Horse obj1=new Horse();
//         // obj1.Eat();
//         obj1.Eat();
//         Camel obj2=new Camel();
//         obj2.Eat();
//     }
// }

// COnstructor chaining
abstract class Animal{

    abstract void Eat();
    Animal(){
        System.out.println(" I am Animal constructor");
    }
    public static void func1(){
        System.out.println("I am base class");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("I am horse constructor");
    }
    public void Eat(){
        System.out.println("I am horse,subclass");
    }
}
class Camel extends Animal{
    public void Eat(){
        System.out.println("I am camel,subclass");
    }
}

class abstraction{
    public static void main(String arg[]){
        Horse obj1=new Horse();
        // obj1.Eat();
        // obj1.Eat();
        // Camel obj2=new Camel();
        // obj2.Eat();
    }
}

// interface Animal{
//     int eyes=2;
//     public void Eat();
// }
// interface Herbivore{

// }
// class Horse implements Animal,Herbivore{
//     public void Eat(){
//         System.out.println("I am horse,implement interface by class");
//     }
// }
// class abstraction{
//     public static void main(String arg[]){
//         Horse obj1=new Horse();
//         obj1.Eat();
//     }
// }


// static keyword

// class Animal{
//     static String school;
//     public static void changeSchool(){
//         school="EFG";
//     }
// }
// class abstraction{
//     public static void main(String arg[]){
//         Animal.school="ABC";
//         System.out.println(Animal.school);
//         Animal.changeSchool();
//         System.out.println(Animal.school);
//     }
// }