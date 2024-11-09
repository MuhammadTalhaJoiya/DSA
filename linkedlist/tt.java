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


class LL{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            newNode=head;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            newNode=head;
            return;
        }
        Node curNode=head;
        while(curNode.next!=null){
            curNode.next=curNode;
        }
        curNode.next=newNode;
    }
    public static void main(String arg[]){
        LL list=new LL();
        list.addFirst("this");
        list.addFirst("is");

    }
}