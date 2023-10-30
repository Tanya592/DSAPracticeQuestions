
//count the no of elements greater than value x
public class countthenoofelements
{
	public static void main(String[] args) {
		int count=0;
		int x=5;
		int arr[]={1,2,3,4,5,6,7,8};
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>x){
		        count++;
		    }
		    System.out.println(count);
		}
	}
}
