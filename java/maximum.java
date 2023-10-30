//maximum no out of an array
public class maximum
{
	public static void main(String[] args) {
		int ans=0;
		int arr[]={1,9,4,7,90};
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>ans){
		        ans=arr[i];
		    }
		    
		}
		System.out.println(ans);
		
	}
}
