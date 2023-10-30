import java.util.*;
public class leapyear
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%4==0 && n%100!=0 || n%400==0){
    System.out.println("year is leap ");
}
else{
    System.out.println("Year is not leap");
}

	}
}
