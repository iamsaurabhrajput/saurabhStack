package Stack;

import java.util.Scanner;

public class ReverseStack {
    // instance variable
    int arr[];
    int size;
    int top;
    // constructor
    public ReverseStack(int Stscksize){
        arr= new int[Stscksize];
        size= Stscksize;
        top=-1;
    }
    //push
    public void push(int element){
        if(top==size-1){
            System.out.println("The stack is overflow :");
            return;
        }
        else{
            top++;
            arr[top]=element;
        }

    }
    // pop

    public void display(){
        if(top==-1){
            System.out.println("the stack is underflow:");
        }
        for(int i= top ; i>=0; i--){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of stack:" );
        int n= sc.nextInt();
        ReverseStack obj= new ReverseStack(n);
//        obj.push(5);
//        obj.push(6);
//        obj.push(7);
//        obj.push(8);
      for(int i= 0; i<n-1;i++){

      }

        obj.display();
    }
}
