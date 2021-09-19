package Solution;

import java.util.Scanner;

public class TwoSumIIInputArrayIsSorted {
    public static int[] TwoSumIIInputArrayIsSorted(int[] numbers, int target) {
        int arr[]=new int[2];
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    arr[0]=i+1;
                    arr[1]=j+1;
                }
            }
        }
        return arr;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int arr1[]=TwoSumIIInputArrayIsSorted(arr,target);

        for(int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
