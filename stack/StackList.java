// class StackList{
//     // Node head;
//     static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     static class Stack{
//         public static Node head;
//         public static boolean isEmpty(){
//             return head==null;
//         }
//         public static void push(int data){
//             Node newNode=new Node(data);
//             if(isEmpty()){
//                 head=newNode;
//                 return;
//             }
//             newNode.next=head;
//             head=newNode;

//         }
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top=head.data;
//             head=head.next;
//             return top;
//         }
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top=head.data;
//             return top;
//         }
//     }
//     public static void main(String main[]){
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// import java.util.stream.Gatherer.Integrator;
// class StackList{
//     // Node head;
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=next;
//         }
//     }
//     static class Stack{
//         public static Node head;
//         public boolean isEmpty(){
//             return head==null;
//         }
//         public void push(int data){
//             Node newNode=new Node(data);
//             newNode.next=head;
//             head=newNode;
//         }
//         public int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top=head.data;
//             head=head.next;
//             return top;

//         }
//         public int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }
//     }
//     public static void main(String main[]){
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }