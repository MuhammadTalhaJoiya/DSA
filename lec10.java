// import java.util.Scanner;

// public class lec10{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int number=sc.nextInt();
//         int simarray[]=new int[number];

//         for(int i=0;i<number;i++){
//             int numberinput=sc.nextInt();
//             simarray[i]=numberinput;
//         }
//         for(int i=0;i<number;i++){
//             System.out.println("elements are" + simarray[i]);
//         }
//     }
// }


import java.util.Scanner;

public class lec10{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many number you want to add in your array");
        int number=sc.nextInt();
        int simarray[]=new int[number];

        for(int i=0;i<number;i++){
            System.out.println("what is your number");
            int numberinput=sc.nextInt();
            simarray[i]=numberinput;
            // System.out.println(simarray[i]);
        }
        System.out.println("what is your desired array number");
        int checknum=sc.nextInt();
        for(int i=0;i<simarray.length;i++){
            if(checknum==simarray[i]){
                System.out.println("array of the number is " + i);
            }
        }
    }
}