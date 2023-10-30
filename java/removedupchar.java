import java.util.*;
public class removedupchar {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //programming
        String res="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                //if first and its next character is not same then it will added to result string
                res+=s.charAt(i);
            }
        }
        res+=s.charAt(s.length()-1);
        System.out.println(res);
    }
}

