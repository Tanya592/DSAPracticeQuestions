#include<iostream>
using namespace std;
int returnMax(int array[],int n){
    int max=0;
    for(int i=0;i<n;i++){
        if(array[i]>max){
            max=array[i];
        }
    }
    return max;
}
int main(){
    int arr[]={1,6,9,45,100};
    int max=returnMax(arr,5);
    cout<<max<<endl;
    return 0;

}