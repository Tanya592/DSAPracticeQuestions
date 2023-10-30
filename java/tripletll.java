import java.util.*;
public class tripletll {
   
//Triplet From LinkedList
//
//Given three linked lists, say a, b and c, find one node from each list such that the sum of the values of the nodes is equal to a given number, say, Target. As any number of answers can be possible, return the first one you get while traversing.
//
//Input Format
//
//The First Line contains 3 Integers n, m and k as the Size of the Three LinedLists. Next 3 Lines contains n, m and k number of integers respectively as the elements of Linked Lists. Next Line contains an Integer as Target.
//
//Constraints
//
//The Size of the Lists can be different.
//
//Output Format
//
//Display the 3 elements from each of the Lists whose sum is equal to the target separated by space.
//
//Sample Input
//
//3 3 3
//12 6 29
//23 5 8
//90 20 59
//101
//
//
//Sample Output
//
//6 5 90
//
//Explanation
//
//In the Given Sample Input, 6, 5 and 90 from lists 1, 2 and 3 respectively add to give 101.

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int[] arr = new int[x];
        int[] brr = new int[y];
        int[] crr = new int[z];
        int a= 0;
        int b = 0;
        int c = 0;
        // this is most brute force method can be further optimised in O(N);
        for(int i =0 ; i<x; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0 ; i<y; i++){
            brr[i] = sc.nextInt();
        }
        for(int i =0 ; i<z; i++){
            crr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();

        for(int i =0 ; i<x; i++){
            for(int j = 0; j<y; j++){
                for(int k = 0; k<z; k++){
                    if(arr[i] + brr[j] + crr[k] == tar){
                        System.out.print(arr[i] +" ");
                        System.out.print(brr[j] + " ");
                        System.out.print(crr[k]);
                        return;
                    }
                }
            }
        }

    }
}



    

