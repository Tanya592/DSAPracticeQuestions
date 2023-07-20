#include<iostream>
using namespace std;
int main(){
    int a,b,c;
    cin>>a>>b>>c;
    if(a==b && b==c){
        cout<<"equilateral triangle"<<endl;
    }
    else if(a==b || b==c){
        cout<<"isosceles triangle"<<endl;
    }
    else{
        cout<<"scalene triangle";
    } 

    return 0;

}