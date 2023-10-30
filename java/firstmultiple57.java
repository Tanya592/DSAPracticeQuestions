import java.util.*;
public class firstmultiple57
{
    
	public static void main(String[] args) {
		//System.out.println("Hello World");
//print the first multiple of 5 and 7 using break keyword
		int num=1;
		while(true){
		    if(num%5==0 && num%7==0){
		        System.out.println(num);
		        break;
		    }
		    num++;
		}
	}
}
