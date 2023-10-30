import java.util.*;
public class costofgroceries {
    
//Question Statement: Chef visited a grocery store for fresh supplies. There are N items in the store where the ith item has a freshness value Ai and cost Bi.
//Chef has decided to purchase all the items having a freshness value greater than equal to X. find the total cost of groceries the chef buys.
//Input format:
//Each test case consists of multiple lines of input.
//The first line of each test case contains two space-separated integers
//N and X — the number of items and the minimum freshness value an item should have.
//The second line contains N space-separated integers, the array A, denoting the freshness value of each item.
//The third line contains N space-separated integers, the array B, denoting the cost of each item.
//Output Format:
//For each test case, output on a new line, the total cost of the groceries Chef buys.
//
//Example:
//Input:
//2 20		//N and X
//15 67		//the array A, denoting the freshness value of each item
//10 90		//the array B, denoting the cost of each item
//
//Output:
//90		//total cost of groceries the chef buys
//
//Explanation:
//Item 2 has freshness value greater than equal to X=20
//Thus, Chef buys item 2
//The total cost is 90
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //n is no of items
        int n=sc.nextInt();
        //x is the min value to which we should exceed/compare
        int x=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] brr=new int[n];
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        int totalcost=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=x){
                totalcost+=brr[i];
            }
        }
        System.out.println(totalcost);

    }
}
