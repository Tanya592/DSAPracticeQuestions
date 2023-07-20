// Given two integers, n and m. The task is to check the relation between n and m.
// 

class Solution {
  public:
    string compareNM(int n, int m){
        // code here
        
        if(n<m)
        return "lesser";
        
                
        if(n==m)
        return "equal";
        
                
        if(n>m)
        return "greater";
    }
};