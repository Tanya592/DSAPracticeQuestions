public class lllength {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;

        }
        return count;

    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        System.out.println(length(a));
    }
}



    

