public class linearsearch {
   
    public static int LinearSearch(int [] numbers,int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int key=10;
        int [] numbers ={1,5,6,7,9,10};
        int index=LinearSearch(numbers, key);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("element found at index" + index);
        }
    }
}

    

