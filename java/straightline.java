import java.util.*;
public class straightline
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
	    int x2=sc.nextInt();
		int x3=sc.nextInt();
		int y1=sc.nextInt();
		int y2=sc.nextInt();
		int y3=sc.nextInt();
		if ((y3-y2)/(x3-x2)==(y2-y1)/(x2-x1)){
		System.out.println("straight line is formed");
		}
		
	else{
	    System.out.println("No straight line is formed");
	}
	}
}
