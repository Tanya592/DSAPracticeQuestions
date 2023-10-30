//count the no of occurences of a particular element x
public class noofoccurrences
{
	public static void main(String[] args) {
	int count=0;
	int x=7;
	int arr[]={1,5,6,7,5};
	for(int i=0;i<arr.length;i++){
	    if(arr[i]==x){
	        count++;
	    }
	}
	System.out.println(count);
	}
}
