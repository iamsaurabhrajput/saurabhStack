package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String str){
        if(str.length()%2!=0){
            return false;
        }
        // stack creation
        Stack<Character> stack= new Stack<>();
        for(int i= 0; i<str.length(); i++ ){
            char ch = str.charAt(i);
            if(ch=='('|| ch=='{'|| ch=='['){
                stack.push(ch);
            }
            else if (ch==')'|| ch=='}'|| ch==']'){
                if(stack.empty()){
                    return false;
                }
                int top = stack.peek();
                if((ch==')'&& top=='(')||(ch=='}'&& top=='{')||(ch==']'&& top=='[')){
                    stack.pop();
                }
            }
            else{
                return false;
            }

        }
        return (stack.size()==0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String str= sc.nextLine();
        ValidParentheses obj =  new ValidParentheses();
        boolean res = obj.isValid(str);
        System.out.println("is valis :" + res);
    }
}
