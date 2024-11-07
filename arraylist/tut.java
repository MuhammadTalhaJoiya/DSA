// Objective: Implement sorting and searching operations on an ArrayList.
// Description:
// • Create an ArrayList of integers.
// • Perform the following:
// 1. Insert 20 random integers.
// 2. Implement a method to sort the ArrayList using any sorting algorithm (e.g.,
// Collections.sort() or your own sorting algorithm like bubble sort).
// 3. Implement binary search on the sorted list (use Collections.binarySearch()

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class tut{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<20;i++){
            int user=sc.nextInt();
            list.add(user);
        }
        System.out.println(list);
        Collections.sort(list);
        // System.out.println(list);
        // // System.out.println(list.get(2));
        // list.add(1,1000);
        // list.set(2,1000);
        // list.remove(2);
        // System.out.println(list.size());
        System.out.println(list);
        int indexarray=Collections.binarySearch(list,5555);
        System.out.println(indexarray);
    }
}