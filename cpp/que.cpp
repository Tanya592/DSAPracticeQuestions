//given an array of integers change the value of all odd indexed elements to its second multiple and increment all even indexed value by 10
#include<iostream>
using namespace std;
int main(){
    int arr[7]={1,2,3,4,5,6,7};
    for(int i=0;i<=7;i++){
        if(i%2==0){
            arr[i]=arr[i]+10;
        }
        else{
            arr[i]=arr[i]*2;
        }
    }
    return 0;

}