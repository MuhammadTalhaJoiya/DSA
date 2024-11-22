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
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+ "-->" );
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node lastNode=head.next;
        Node secondlastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondlastNode=secondlastNode.next;
        }
        secondlastNode.next=null;
    }
    // public void reverseList(){
    //     if(head==null||head.next==null){
    //         return;
    //     }
    //     Node prevNode=head;
    //     Node currNode=head.next;
    //     while(currNode!=null){
    //         Node nextNode=currNode.next;
    //         currNode.next=prevNode;
    //         prevNode=currNode;            
    //         currNode=nextNode;
    //     }
    //     head.next=null;
    //     head=prevNode;
    // }
    public Node reverseRecursive(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newNode=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
    
    public static void main(String arg[]){
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("topic");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        list.addFirst("topic");
        list.printList();
        // list.reverseList();
        // list.printList();
        list.head=list.reverseRecursive(list.head);
        list.printList();
    }
}
