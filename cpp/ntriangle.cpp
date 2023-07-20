/*code link- https://www.codingninjas.com/studio/problems/n-triangles_6573689?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
n=3
1
12
123
*/

void nTriangle(int n) {
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			cout<<j<<" ";
		}
		cout<<endl;
	}
}
/*
que 2
question link= https://www.codingninjas.com/studio/problems/triangle_6573690?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
output
n=3
1
22
333
*/
void triangle(int n) {
	// Write your code here
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			cout<<i<<" ";
		}
		cout<<endl;
	}
}
