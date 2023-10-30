//find the total no of pairs in the array whose sum is equal to the given value x
import java.util.*;
public class array2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    //for taking input the length of an array
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    //for taking the input the elements of an array
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    
	    int target=sc.nextInt();
	    //int n=arr.length;
	    int ans=0;
	    for(int i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if(arr[i]+arr[j]==target){
	                ans++;
	                
	            }
	        }
	    }
	    
		System.out.println(ans);
	}
}
