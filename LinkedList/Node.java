package LinkedList;

public class Node {

    //fields
    int val;
    Node next;

    //constructor()
    public Node (int val){
        this.val=val;
        this.next=null;
    }

    public static void main(String[] args) {
        Node head;
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head=first;
        first.next=second;
        second.next=third;
        Node tmp=head;
        while(tmp!=null){
            System.out.println(tmp.val+ " ");
            tmp = tmp.next;
        }
    }
}
