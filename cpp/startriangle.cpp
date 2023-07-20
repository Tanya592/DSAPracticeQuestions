/*question link
https://www.codingninjas.com/studio/problems/star-triangle_6573671?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
output-
    *
   ***
  ***** 
*/
void nStarTriangle(int n) {
    // Write your code here.
    //for printing rows
    for(int i=0;i<n;i++){
        //for printing space
        for(int j=0;j<n-i-1;j++){
            cout<<" ";
        }
        //for printing stars
        for(int j=0;j<2*i+1;j++){
            cout<<"*";
        }
        //for printing space
        for(int j=0;j<n-i-1;j++){
            cout<<" ";
        }
        cout<<endl;
    }
}