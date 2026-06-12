package Stack;

import java.util.Scanner;

public class StackImp {
    int arr[];
    int top;
    int size;
    //constructor
    public StackImp(int stacksize){
        arr=new int[stacksize];
        size=stacksize;
        top =-1;
    }
    //push
    public void  push( int element ){
        if(top==size-1){
            System.out.println("stack is over flow");
            return;
        }
        else{
            top++;
            arr[top]=element;
        }
    }
    // peek
    public void peek(){
        if(top==-1){
            System.out.println("Stack is underflow:");
        }
        System.out.print("The peek element is: " + arr[top]);
       // return arr[top];
    }
    // pop
    public void  pop(){
        if(top ==-1){
            System.out.print("atack is underflow :");
        }
        top--;
    }
    // display
    public void display(){
        if(top==-1){
            System.out.println("stack is underflow :");
            return ;
        }
        else{
            System.out.print("final stack is :");
            for(int i= top; i>=0; i--){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of stack ");
        int n = sc.nextInt();
        StackImp obj = new StackImp(n);
        for(int i =0; i<5; i++){
            System.out.print("enter the element that you want to insert :");
            int element=sc.nextInt();
            obj.push(element);
        }
        obj.peek();
        obj.pop();
        obj.display();

    }
}
