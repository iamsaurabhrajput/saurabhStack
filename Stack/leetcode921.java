package Stack;

import java.util.Scanner;
import java.util.Stack;

class leetcode921{
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        int count =0;
        for(int i= 0; i<n; i++){
            char ch = s.charAt(i);

            if(ch=='('){
                stack.push(ch);
                count++;
            }
            else{
                if(!stack.isEmpty() && ch==')' && stack.peek()=='('){
                    stack.pop();
                    count--;
                }
                else{
                    stack.push(ch);
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();

        leetcode921 obj = new leetcode921();

        int ans = obj.minAddToMakeValid(s);

        System.out.println(" minAddToMakeValid are: " + ans);
    }
}
