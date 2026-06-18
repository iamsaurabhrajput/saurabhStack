package Stack;

import java.util.*;

public class ReverseString {
    public static void main(String[] args){
        // String arr[]=new String[n] {"saurabh","gaurav"}
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n= sc.nextInt();
        sc.nextLine();
        String arr[] =new String[n];
        for(int i=0; i<n; i++){
            System.out.print("enter the name :");
            arr[i]=sc.nextLine();
        }
        Stack<String>  stack = new Stack<>();
        for(int i= 0; i<n; i++){
           // char ch = arr[i];
            stack.push(arr[i]);
        }
        for(int i=n-1; i>=0;i--){
            System.out.print(stack.pop() +" ");
        }


    }

}
