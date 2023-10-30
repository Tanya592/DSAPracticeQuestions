//find the sum of the following series
import java.util.*;
public class sumofap
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		for(int i=1;i<=n;i++){
		if(i%2==0){
		    ans=ans-i;
		    
		}
		else{
		    ans=ans+i;
		}
		}
		System.out.println(ans);
	}
}
