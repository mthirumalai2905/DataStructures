package Stack;

public class ArrayStack {
    public int[] array;
    public int capacity;
    public int top;

    //Construtor to initialize the stack with a given capacity
    public ArrayStack(int capacity){
        this.capacity = capacity;
        array = new int[capacity];
        top = -1;
    }

    //Method to push an element onto the stack
    public void push(int element){
        if(isFull()){
            System.out.println("Stack Overflow. Cannot push element.");
            return;
        }
        array[++top] = element;
    }

    //Method to pop an element from the stack
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow. Cannot pop element");
            return -1;
        }
        return array[top--];
    }

    //Method to peek at the top element of the stack
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty. Cannot peek element");
            return -1;
        }
        return array[top];
    }

    //Method to check if the stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

    //Method to check if the stack is full
    public boolean isFull(){
        return top == capacity - 1;
    }

    //Method to display the stack elements
    public void displayStack(){
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            
            System.out.println(" ");
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayStack();

        System.out.println("Popped element: " + stack.pop());
        stack.displayStack();

        System.out.println("Top element: " + stack.peek());
}
}
