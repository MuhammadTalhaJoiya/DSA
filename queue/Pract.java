// class Pract{
//     static class Queue{
//         int arr[];
//         int size;
//         int rear=-1;
//         Queue(int number){
//             arr=new int[number];
//             this.size=number;
//         }
//         public  boolean isEmpty(){
//             return rear==-1;
//         }
//         public void add(int data){
//             if(rear==size-1){
//                 System.out.println("full queue");
//                 return;
//             }
//             rear++;
//             arr[rear]=data;
//         }
//         public int remove(){
//             if(isEmpty()){
//                 // System.out.println("Empty");
//                 return -1;
//             }
//             int front=arr[0];
//             for(int i=0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear--;
//             return front;
//         }
//         public int peek(){
//             if(isEmpty()){
//                 System.out.println("queue is empty");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }
//     public static void main(String[] arg){
//         Queue s=new Queue(5);
//         s.add(2);
//         s.add(1);
//         s.add(3);
//         s.add(4);
//         s.add(6);
//         // s.add(9);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.remove();
//         }
//     } 

// }



class Pract{
    static class Queue{
        int arr[];
        int rear=-1;
        int size;
        Queue(int number){
            arr=new int[number];
            this.size=number;
        }
        public boolean isEmpty(){
            return rear==-1;
        }
        public void add(int data){
            // rear++;
            if(rear==size-1){
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public int remove(){
            if(isEmpty()){
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] arg){
        Queue s=new Queue(5);
        s.add(3);
        s.add(1);
        s.add(6);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    }
}