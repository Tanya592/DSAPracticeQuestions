//swapping of two numbers using a temporary variable
import java.util.*;
public class swap
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("before swapping");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println(a);
		System.out.println(b);
	}
}
