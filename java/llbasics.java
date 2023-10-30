public class llbasics {
    public static class Node{
        int data;
        //value
        Node next;
        //this is created to store the address of another node
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node x=new Node(5);
        Node a=new Node(6);
        Node y=new Node(5);
        Node z=new Node(5);
//   System.out.println(x.data);// 5 is printed
//        System.out.println(x.next);
  x.next=a;
   a.next=y;
   y.next=z;

//        System.out.println(x.data);
////        default value of x i.e 0 is stored
//   System.out.println(x.next);
////        address of x is printed and everytime a new address is printed
//System.out.println(x.next);//add is printed
//System.out.println(a.data);//6 is printed
System.out.println(x.next);
System.out.println(a.next);
System.out.println(y.next);
System.out.println(z.next);// we didnt linked so null value is printed
//bcoz no value of adress is set
//        we can also access the elements using node x only
//                instead of writing
//        System.out.println(x.data);
//        System.out.println(a.data);
//        System.out.println(y.data);
//        System.out.println(z.data);
        //we can acess using only first node
//        System.out.println(x.data);
//        System.out.println(x.next.data);
//        System.out.println(x.next.next.data);
//        System.out.println(x.next.next.next.data);

////        or we can also do using for loop
//   Node temp=x;
//   for(int i=0;i<=4;i++){
//       System.out.println(temp.data);
//       temp=temp.next;
//   }
   //but when we dnt know the size of linkedlist
//        Node temp=x;
//   while(temp!=null){
//       System.out.println(temp.data);
//       temp=temp.next;
   }
    }



    