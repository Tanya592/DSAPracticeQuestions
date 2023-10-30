import java.util.*;
public class countnoofdigits
{
	public static void main(String[] args) {
		
// 		we can also rename the loops
// 		myloop: for(.....);
// // 		continue myloop;
// for(int i=1;i<5;i++){
//     System.out.println(i+ ",");
//     1,2,3,4, will be printed
    //count the no of digits
    //divide n by 10 until n>0 and count
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    while(n>0){
        n=n/10;
        count++;
    }
    System.out.println(count);
	}
}
