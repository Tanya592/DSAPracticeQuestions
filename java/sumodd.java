//sum of all odd numbers from 1 to n
import java.util.*;
public class sumodd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++){
		    if(i%2==1){
		        sum=sum+i;
		    }
		    System.out.println(sum);
		}
	}
}
