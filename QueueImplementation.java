package Leetcode;

public class QueueImplementation {

    //tanimlama yaptim.(initialization)
    private int[] array;
    private int front;
    private int back;
    private int count;    //arrayda kac eleman oldugunu soyleyecek.

    //atama yaptim.
    public QueueImplementation() {
        this.array = new int[10];
        this.front = 0;     //en basta eleman olmadigi icin sifir.
        this.back = 0;      //en basta eleman olmadigi icin sifir.
        this.count = 0;     //en basta eleman olmadigi icin sifir.
    }
    public boolean isFull(){
        return count==array.length;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void enqueue (int number){
        if(isFull()){
            //array buyult.
            System.out.println("array dolu grow metodu calisiyor.");
            grow();
        }
        array[back++]=number;
        count++;
        print();
    }
    private void grow(){
        int[] newArr = new int[array.length * 2];
        for (int i = front,j=0; i < back; i++,j++) {
            newArr[j] = array[i];
        }
        array = newArr;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("bos arrayden eleman cikarilamaz.");
            return -1;
        }
        int deletedElement = array[front];
        front++;
        count--;
        return deletedElement;
//        count--;
//        return array[front++];
    }
    public void print(){
        for(int i=front; i<back; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueImplementation queueImplementation = new QueueImplementation();

        queueImplementation.dequeue();

        queueImplementation.enqueue(10);
        queueImplementation.enqueue(20);
        queueImplementation.enqueue(30);
        queueImplementation.enqueue(40);
        queueImplementation.enqueue(50);
        queueImplementation.enqueue(10);
        queueImplementation.enqueue(20);
        queueImplementation.enqueue(30);
        queueImplementation.enqueue(40);
        queueImplementation.enqueue(50);
        queueImplementation.enqueue(50);

        queueImplementation.print();

        System.out.println("removed Element: " + queueImplementation.dequeue());  //10
        System.out.println("removed Element: " + queueImplementation.dequeue());  //10
        System.out.println("removed Element: " + queueImplementation.dequeue());  //10


        System.out.println("son durum:");
        queueImplementation.print();
    }
}
