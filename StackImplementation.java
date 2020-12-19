
public class StackImplementation{
   int[] arr;
   int numberOfElements;
    public StackImplementation() {
        this.arr = new int[10];
        this.numberOfElements = 0;
    }
    // Single responsibility principle - bir methoud yada class i degistirmek icin  tek sebep olmali!
    public void push(int val){
        if(isFull()){
            arr = grow(arr);
        }
        arr[numberOfElements++] = val;
    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty. You cannot remove any element from the stack");
            return -1;
        }
        int removedElement = arr[numberOfElements-1];
        arr[numberOfElements-1] = 0; //
        numberOfElements--;
        return removedElement;

    }
    public int peek(){
        return arr[numberOfElements-1];
    }
    private int[] grow(int[] arr){
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public boolean isFull(){
        return arr.length == numberOfElements;
    }
    public boolean isEmpty(){
        return numberOfElements == 0;
    }
    public int size(){
        return numberOfElements;
    }
    public void print(){
        for (int i = numberOfElements-1 ; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();

        stack.push(6);
        stack.push(7);
        stack.push(19);
        stack.push(25);
        stack.push(60);
        stack.push(40);
        stack.push(50);
        stack.push(90);

        stack.print();
        System.out.println();

        System.out.println("current peek element: " + stack.peek()); //90
        System.out.println("Removed element: " + stack.pop()); //90
        System.out.println("current peek element: " + stack.peek()); //50
        System.out.println("Removed element : " + stack.pop()); //50
        System.out.println("Removed element : " + stack.pop()); //40
        System.out.println("Number of elements: " + stack.numberOfElements);
    }
}