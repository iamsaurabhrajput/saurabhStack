package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {

        public ArrayList<Integer> nextLargerElement(int[] arr) {
            int  n= arr.length;
            Stack<Integer> stack = new Stack<>();
            ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

            for(int i = n-1; i>=0;i--){
                while(!stack.isEmpty() && stack.peek()<=arr[i]){
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
        int arr[]= {5,6,4,3,8,9};
        NextGreaterElement obj= new NextGreaterElement();
        System.out.println("Your output is :-");
        System.out.print(obj.nextLargerElement( arr));
    }
    }

