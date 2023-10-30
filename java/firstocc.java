public class firstocc {
    
//que on the basis of binary search , find the first occurrence of a given element x given that the given array is sorted .if no occuurrence is found return -1

    public static int FirstOccurrence(int numbers[],int key){
        int n=numbers.length;
        int start=0;int end=numbers.length-1;
        int result=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                result=mid;
                end= mid-1;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return result;

    }

    public static void main(String[] args) {
        int numbers[]={2,5,5,5,6,6,8,9,9,9};
        int key=5;
        int result = FirstOccurrence(numbers, key);
        System.out.println(result);
    }
}

    

