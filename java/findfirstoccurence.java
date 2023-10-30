//Given a sorted array of integers, find the index of the first occurrence of the target element. If the target is not present, return -1.
public class findfirstoccurence
{
	public static void main(String[] args) {
		int arr[]={1,2,5,3,5,7,8,9,0,3,5};
		int x=5;
		int lastIndex=-1;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]==x){
		        lastIndex=i;
		        break;
		    }
		}
		System.out.println(lastIndex);
	}
}

