package Stack;

import java.util.Scanner;
import java.util.Stack;

class CountReversals {
    public int countMinReversals(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        // int open =0;
        // int close=0;
        for(int i = 0; i<n; i++){
            if(n%2!=0){
                return -1;
            }
            char ch = s.charAt(i);
            if(ch=='{'){
                stack.push(ch);

            }
            else if(ch=='}'){
                // char top = stack.peek();
                if((!stack.isEmpty() && ch=='}'&& stack.peek()=='{')){
                    stack.pop();
                    // open--;
                    // close--;
                }
                else{
                    stack.push(ch);
                    // open++;
                }
            }
            else{
                return -1;
            }
        }
        int open =0;
        int close=0;
        int g= stack.size()-1;
        for(int i=g; i>=0;i--){
            if(stack.pop()=='{'){
                open++;
            }
            else{
                close++;
            }
        }
        int sum= (open+1)/2 +(close+1)/2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new  Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        CountReversals obj= new CountReversals();
        int res = obj.countMinReversals(s);
        System.out.println(" The CountReversals are :" + res);
    }
}

