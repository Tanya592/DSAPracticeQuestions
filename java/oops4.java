import java.util.*;
class Algebra{
    int sum(int a ,int b){
         int ans=a+b;
         return ans;
    }
    
}
public class oops4
{
	public static void main(String[] args) {
	    Algebra obj=new Algebra();
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	   int ans= obj.sum(a,b);
	   System.out.println(ans);
	    
	    
		
	}
}
