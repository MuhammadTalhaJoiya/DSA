// Objective: Insert and Remove elements into and form an ArrayList dynamically at
// specific positions.
// Description:
// • Create an ArrayList of integers including some duplicate values.
// • Perform the following:
// 1. Insert 20 random integers.
// 2. Insert an element at the beginning of the ArrayList.
// 3. Insert an element at the middle index.
// 4. Insert an element at the last index.
// 5. Print the ArrayList after each insertion.
// 6. Remove middle value
// 7. Remove last value
// 8. Implement a method to remove all duplicate values.

import java.util.ArrayList;
import java.util.Scanner;

public class task5{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<20;i++){
            int user=sc.nextInt();
            list.add(user);
        }
        System.out.println(list);
        int user=sc.nextInt();
        list.set(0,user);
        // list.add(0,user);
        System.out.println(list);
        int user2=sc.nextInt();
        list.add(user2);
        System.out.println(list);
        int middlenum=list.size()/2;
        int user3=sc.nextInt();
        list.add(middlenum,user3);
        System.out.println(list);
        System.out.println(list.size());
        int lastelement=list.size()-1;
        list.remove(lastelement);
        int mid=list.size()/2;
        list.remove(mid);
        System.out.println(list);
    }
}
