import java.util.*;
// Alice and Bob recently got into running, and decided to compare how much they ran on different days.
//         They each ran for N days — on the ith day, Alice ran Ai meters and Bob ran Bi meters.       On each day,
//         Alice is unhappy if Bob ran strictly more than twice her distance, and happy otherwise.
//         Similarly, Bob is unhappy if Alice ran strictly more than twice his distance, and happy otherwise.
//         For example:
//         If Alice ran 200 meters and Bob ran 500, Alice would be unhappy but Bob would be happy.
//         If Alice ran 500 meters and Bob ran 240, Alice would be happy and Bob would be unhappy.
//         If Alice ran 300 meters and Bob ran 500, both Alice and Bob would be happy.
//         On how many of the N days were both Alice and Bob happy?

public class alicebob {
    public static int countHappyDays(int n,int[] AliceDistance,int[] BobDistance){
        int happyDays=0;
        for(int i=0;i<n;i++){
            if(AliceDistance[i]<=2*BobDistance[i] && BobDistance[i]<=2*AliceDistance[i]){
                happyDays++;
            }
        }
        return happyDays;
    }


    public static void main(String[] args) {
        int n=3;
        int[] AliceDistance={200,500,300};
        int[] BobDistance={500,240,500};
        int happyDays=countHappyDays(n,AliceDistance,BobDistance);
        System.out.println(happyDays);

    }
}
