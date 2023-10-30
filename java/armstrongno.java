import java.util.*;

public class armstrongno {
    public static void main(String[] args) {
        int arm=0,rem;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.println("Armstrong numbers");
        }
        else{
            System.out.println("not armstrong numbers");
        }

    }
}
