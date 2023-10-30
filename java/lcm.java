//lcm of 2 numbers
import java.util.*;
public class lcm {
    static int PrintLCM(int n1,int n2){
        int gcd=1;
        int lcm=0;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        lcm=n1*n2/gcd;
        return lcm;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(PrintLCM(n1,n2));

    }
}