import java.util.*;
public class absolute
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int CP=sc.nextInt();
	    int SP=sc.nextInt();
		//System.out.println("Hello World");
		if(SP>CP){
		    System.out.println("profit is made");
		    System.out.println((SP-CP) + "rs profit is made");
		    }
		    else{
		        System.out.println("loss is made");
		        System.out.println((CP-SP) + "rs loss is made");
		    }
		
		
	}
}
