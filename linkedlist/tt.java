// class LL{
//     Node head;
//     class Node{
//         String data;
//         Node next;
//         Node(String data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     // add first|add last
//     public void addFirst(String data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//     public void addLast(String data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//             return;

//         }
//         Node currNode=head;
//         while(currNode.next!=null){
//             currNode=currNode.next;
//         }
//         currNode.next=newNode;
//     }


//     public static void main(String args[]){
//         LL list=new LL();
//         list.addFirst("This");
//         list.addFirst("is");

//     }
// }


// class LL{
//     private int size;
//     LL(){
//         this.size=0;
//     }
//     Node head;
//     class Node{
//         String data;
//         Node next;
//         Node(String data){
//             this.data=data;
//             this.next=null;
//             size++;
//         }
//     }
    
//     public void addFirst(String data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
    

//     public void addLast(String data){
//         Node newNode=new Node(data);
//         if(head==null){
//             newNode=head;
//             return;
//         }
//         Node curNode=head;
//         while(curNode.next!=null){
//             curNode=curNode.next;
//         }
//         curNode.next=newNode;
//     }
//     public void printList(){
//         if(head==null){
//             System.out.println("list is empty");
//             return;
//         }
//         Node currNode=head;
//         while(currNode!=null){
//             System.out.print(currNode.data+"-->");
//             currNode=currNode.next;
//         }
//         System.out.println("null");
//     }

//     // DeleteFirst|DeleteLast
//     public void DeleteFirst(){
//         if(head==null){
//             System.out.println("Linklist is empty");
//             return;
//         }
//         size--;
//         head=head.next;
//     }
//     public void DeleteLast(){
//         if(head==null){
//             System.out.println("linklist is empty");
//             return;
//         }
//         size--;
//         if(head.next==null){
//             head=null;
//             return;
//         }
//         Node secondLastNode=head;
//         Node LastNode=head.next;
//         while (LastNode.next!=null) {
//             secondLastNode=secondLastNode.next;
//             LastNode=LastNode.next;
//         }
//         secondLastNode.next=null;
//     }

//     public int getSize(){
//         return size;
//     }
//     public static void main(String arg[]){
//         LL list=new LL();
//         list.addFirst("this");
//         list.addFirst("is");
//         list.printList();
//         list.addFirst("linkedlist");
//         list.printList();
//         list.addLast("last");
//         list.printList();
//         list.DeleteFirst();
//         list.printList();
//         list.DeleteLast();
//         list.printList();
//         list.addFirst("Talha");
//         list.printList();
//         System.out.println(list.getSize());
//     }
// }

import java.util.*;
class LL{
    public void main(String args[]){
        LinkedList<String> list=new LinkedList<String>();
        list.addFirst("Talha");
        list.addFirst("student");
        list.addFirst("the");
        list.addFirst("I am");
        list.addLast("Joiya");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"-->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.remove(0));
    }
}