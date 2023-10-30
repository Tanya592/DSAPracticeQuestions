
//count the no of triplets whose sum is equal to the given x
import java.util.*;
public class triplets
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    //for taking input of array length
	   int n=sc.nextInt();
	   //for taking input the elemnts of an array
	   int arr[]=new int[n];
	  for(int i=0;i<n;i++){
	      arr[i]=sc.nextInt();
	  }
	  int target=sc.nextInt();
	  int ans=0;
	  for(int i=0;i<n;i++){
	      for(int j=i+1;j<n;j++){
	          for(int k=j+1;k<n;k++){
	              if(arr[i]+arr[j]+arr[k]==target){
	                  ans++;
	              }
	          }
	      }
	  }
	  System.out.println(ans);
	}
}
