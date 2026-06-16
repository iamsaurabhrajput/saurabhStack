package Stack;
//import java.util.Collections;
//import java.util.Stack;
//import java.util.ArrayList;
import java.util.*;

public class NextSmallerElement {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        int n= arr.length;
        ArrayList<Integer> ans =new ArrayList<>(Collections.nCopies(n, 0));
        Stack<Integer> stack = new Stack<>();
        for(int i =n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans.set(i,-1);
            }
            else{
                ans.set(i,stack.peek());
            }
            stack.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 3,5,4,7,3,2,8,9};
        NextSmallerElement obj = new NextSmallerElement();
        System.out.println(" your smaller elements are :");
        System.out.println(obj.nextSmallerEle(arr));
    }
}
