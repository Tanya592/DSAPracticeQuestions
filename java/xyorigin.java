import java.util.*;
public class xyorigin
{
	public static void main(String[] args) {
		//.out.println("Hello World");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	if(x==0 && y==0){
	    System.out.println("point lies at origin");
	}
	else if(x==0){
	    System.out.println("point lies at y axis");
	}
	else{
	    System.out.println("point lies at x axis");
	}
	}
}
