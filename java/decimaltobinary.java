import java.util.*;
public class decimaltobinary
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int decimal_number=sc.nextInt();
		int ans=0;
		int pw=1;
		while(decimal_number>0){
		    int parity=decimal_number%2;
		    ans=ans+parity*pw;
		    decimal_number=decimal_number/2;
		     pw=pw*10;
		}
		System.out.println(ans);
	}
}
