// class Pen{
//     String color;
//     String type;
//     public void write(){
//         System.out.println("Write anything from " + this.type);
//     }

// }
// public class tut{
//     public static void main(String args[]){
//         Pen penobj1=new Pen();
//         penobj1.color="Red";
//         penobj1.type="Gel pen";
//         System.out.println(penobj1.color);
//         System.out.println(penobj1.type);
//         penobj1.write();
//         Pen penobj2=new Pen();
//         penobj2.color="Blue";
//         penobj2.type="Ink";
//         System.out.println(penobj1.color);
//         System.out.println(penobj1.type);
//         penobj2.write();
//     }
    

// }

// class Pen{
//     String color;
//     String type;

//     Pen(){
//         this.color="RED";
//         this.type="Gel";
//         System.out.println("I am constructor");
//     }
// }

// public class tut{
//     public static void main(String args[]){
//         Pen obj1=new Pen();
//         System.out.println(obj1.color);
//         System.out.println(obj1.type);
//     }
// }

// Parameterize 

// class Pen{
//     String color;
//     String type;

//     Pen(String col,String type){
//         this.color=col;
//         this.type=type;
//         System.out.println("I am constructor " + color);
//     }
// }

// public class tut{
//     public static void main(String args[]){
//         Pen obj1=new Pen("Blue","InkPen");
//         Pen obj2=new Pen("Blue22","InkPen22");
        
//         System.out.println(obj1.color);
//         System.out.println(obj1.type);
//         System.out.println(obj2.color);
//         System.out.println(obj2.type);


//     }
// }


class Pen{
    String color;
    String type;

    Pen(Pen st){
        this.color=st.color;
        this.type=st.type;
        System.out.println("I am constructor " + color);
    }
    Pen(){

    }
    
}

public class tut{
    public static void main(String args[]){
        Pen pen1=new Pen();
        pen1.color="Green";
        pen1.type="InkPenGel";
        Pen pen2=new Pen(pen1);
        System.out.println(pen1.color);
        System.out.println(pen2.color);
    }
}