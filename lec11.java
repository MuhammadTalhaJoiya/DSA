// import java.util.*;
// public class lec11{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int row=sc.nextInt();
//         int col=sc.nextInt();
//         int[][] arr2d=new int[row][col];
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 arr2d[i][j]=sc.nextInt();
//             }
//         }
//         for(int i=0;i<row;i++){
//             for(int j=0;j<col;j++){
//                 System.out.print(arr2d[i][j]);
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }

//     }
// }


// take a matrix as input from the user.search for a given number x and print the indices at which it occurs.
import java.util.*;

public class lec11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] arr2d=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2d[i][j]=sc.nextInt();
            }
        }
        System.out.println("What is your number you want the index of it?");

        int numberindex=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr2d[i][j]==numberindex){
                    System.out.println("Index are " + i + " " + j);
                }
            }
        }
    }
}