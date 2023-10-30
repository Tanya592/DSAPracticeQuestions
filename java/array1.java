//given an array a consisting of arrays ,return the first value that is repeating in the array  , if no value is returned print -1
import java.util.*;
public class array1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=i;j<n;j++){
		        if(arr[i]==arr[j]){
		        }
		    }
		    System.out.println(arr[i]);
		}
	}
}
