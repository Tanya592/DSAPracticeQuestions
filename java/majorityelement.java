//Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.
import java.util.*;
public class majorityelement {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(arr[i]==arr[j]){
                   count++;
               }
           }
               if(count>n/2){
                   System.out.println(arr[i]);
                   break;
               }
           }
        }
     }