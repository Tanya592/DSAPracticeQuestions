/*
question link- https://www.codingninjas.com/studio/problems/reverse-number-triangle_6581889?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
output
n=3
123
12
1
*/
void seeding(int n) {
	// Write your code here.
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n-i+1;j++){
			cout<<"* ";
		}
		cout<<endl;
	}
}