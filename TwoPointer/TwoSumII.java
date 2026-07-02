package TwoPointer;

import java.util.Scanner;

public class TwoSumII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arry: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of array: ");
        for(int i= 0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        //{ 2,3,4,5,6,} target = 7;
        System.out.println("enter the target value :");
        int target = sc.nextInt();
        int low= 0;
        int high= arr.length-1;
        while(low<high){
            int sum = arr[low]+arr[high];
            if(sum==target){
                System.out.print(" the indexs are [" +low +","+high+"]");
                break;
            } else if(sum >target) {
                high--;
            }
            else{
                low++;
            }
        }

    }
}
