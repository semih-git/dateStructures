package LinkedList;

public class LinkListDene {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(1);
        myLinkedList.addAtHead(5);
        myLinkedList.addAtHead(6);
        myLinkedList.listeyiYazdir();
        System.out.println(" *** *** *** ");
        myLinkedList.addAtTail(3);
        myLinkedList.listeyiYazdir();

//        myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
//        myLinkedList.get(1);              // return 2
//        myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
//        myLinkedList.get(1);              // return 3

    }
}
